package com.java456.service.Impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.java456.entity.Tree;
import com.java456.entity.User;
import com.java456.service.PublicService;
import com.java456.service.TreeService;
import com.java456.service.UserService;
import com.java456.util.MyUtil;



@Service("publicService")
public class PublicServiceImpl implements PublicService {
	
	@Resource
	private TreeService treeService;
	@Resource
	private UserService userService;
	
	
	public void addLeftMenu(ModelAndView mav) {
		
		mav.addObject("leftPage", "/admin/common/left_menu.jsp");
		
		User currentUser = (User) SecurityUtils.getSubject().getSession().getAttribute("currentUser");
		currentUser = userService.findById(currentUser.getId());
		
		Map<String, Object> map = new HashMap<String, Object>();
		String menuIds = currentUser.getMenuIds();
		if(menuIds==null){
			menuIds = "";
		}
		List<Integer> ids =MyUtil.Str_ids_To_ListInteger_ids(menuIds);  
		map.put("father", -1);
		map.put("ids", ids);
		
		if(ids.size()>0){
		}else{
			mav.addObject("treeList", null);
		}
		
		try {
			List<Tree> treeList = getTreesByParentId(map);
			mav.addObject("treeList", treeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 拿菜单
	 */
	public List<Tree> getTreesByParentId(Map<String,Object> map) throws Exception {
		//String parentId,String ids  = map
		List<Tree> list = treeService.getTreesByFatherOrIds(map);
		for(Tree tree : list){
			//如果 是复选框  可以在这里判断   
			//tree.setChecked(true);
			if("open".equals(tree.getState())){
				continue;
			}else{
				map.put("father", tree.getId()+"");//更换father  不换ids继续查
				tree.setChildren(getTreesByParentId(map));
			}
		}
		return list;
	}
	
	
}
