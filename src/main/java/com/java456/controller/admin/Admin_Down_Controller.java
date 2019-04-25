package com.java456.controller.admin;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java456.entity.Blog;
import com.java456.entity.Config;
import com.java456.entity.Down;
import com.java456.entity.PageBean;
import com.java456.entity.User;
import com.java456.service.DownService;
import com.java456.util.DateUtil;
import com.java456.util.FileUtil;
import com.java456.util.ResponseUtil;
import com.java456.util.StringUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin/down")
public class Admin_Down_Controller {
	

	@Resource
	private DownService downService;
	
	
	/**
	 *  /admin/down/add
	 */
	@RequestMapping("/add")
	public String add(Down down, HttpServletResponse response, HttpServletRequest request) throws Exception {
		down.setCreateDateTime(new Date());
		down.setUpdateDateTime(new Date());
		down.setClickHit(0);
		down.setReplyHit(0);
		
		User currentUser = (User) SecurityUtils.getSubject().getSession().getAttribute("currentUser");
		down.setCreateUserId(currentUser.getId());
		
		int resultTotal = downService.add(down);
		
		
		//从缓存中取出config
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();  
        ServletContext servletContext = webApplicationContext.getServletContext(); 
        Config config = (Config)  servletContext.getAttribute("config");
        //从缓存中取出config
        down.setUrl(config.getWeb_site()+"/a/down/get?id="+down.getId());
        downService.update(down);
		
		
		JSONObject result = new JSONObject();
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "添加成功");
			result.put("btn_disable", true);
		} else {
			result.put("success", false);
			result.put("msg", "添加失败");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	/**
	 *  /admin/down/update
	 */
	@RequestMapping("/update")
	public String update(Down down , HttpServletResponse response, HttpServletRequest request) throws Exception {
		down.setUpdateDateTime(new Date());
		int resultTotal = downService.update(down);
		JSONObject result = new JSONObject();
		
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "添加成功");
			result.put("btn_disable", false);
		} else {
			result.put("success", false);
			result.put("msg", "添加失败");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	/**
	 * /admin/down/list
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "limit", required = false) String rows,
			@RequestParam(value = "q", required = false) String q, 
			@RequestParam(value = "downFenLeiId", required = false) String downFenLeiId, 
			@RequestParam(value = "createUserId", required = false) String createUserId, 
			HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("q", StringUtil.formatLike(q));
		map.put("createUserId", createUserId);
		map.put("downFenLeiId", downFenLeiId);
		
		List<Down> list = downService.list(map);
		Integer total = downService.getTotal(map);
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
		
		
		map.clear();
		map.put("data", list);
		map.put("count", total);
		map.put("code", 0);
		map.put("msg", "");
		ResponseUtil.write(response, gson.toJson(map));
		return null;
	}
	
	
	/**
	 *   /admin/down/delete
	 * @param ids
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
			throws Exception {
		String[] idsStr = ids.split(",");
		JSONObject result = new JSONObject();
		
		for (int i = 0; i < idsStr.length; i++) {
			downService.delete(Integer.parseInt(idsStr[i]));
		}
		result.put("success", true);
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	
	/**
	 * /admin/down/findById
	 * 通过Id查找实体
	 * @param id
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		Down  down=downService.findById(Integer.parseInt(id));
		Gson gson =new Gson();
		ResponseUtil.write(response, gson.toJson(down));
		return null;
	}
	
	
	/**
	 * /admin/down/add_thumbnail_image
	 */
	@RequestMapping("/add_thumbnail_image")
	public String add_thumbnail_image(
	        @RequestParam(value="name",required=false)String name,
	        @RequestParam("file") MultipartFile file, 
	        HttpServletResponse response, HttpServletRequest request) throws Exception {
	        JSONObject result = new JSONObject();
	        
	        if(!file.isEmpty()){
	            String webPath=request.getServletContext().getRealPath("");
	            String filePath= "/static/upload_image/down/"+DateUtil.formatDate(new Date(), "yyyy-MM-dd")+"/";
	            //把文件名子换成（时间搓.png）
	            // String imageName="houtai_logo."+file.getOriginalFilename().split("\\.")[1];
	            
	            FileUtil.makeDirs(webPath+filePath);
	            
	            String imageName=DateUtil.formatDate(new Date(), "yyyy-MM-dd-hh-mm-ss-SSS")+".jpg";
	            
	            file.transferTo(new File(webPath+filePath+imageName));
	            result.put("success", true);
	            result.put("path", filePath+imageName);
	        }
	        ResponseUtil.write(response, result.toString());
	        return null;
	}
	
	
	
	
	
	
}
