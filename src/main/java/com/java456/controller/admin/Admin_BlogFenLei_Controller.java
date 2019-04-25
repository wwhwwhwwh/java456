package com.java456.controller.admin;



import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java456.entity.BlogFenLei;
import com.java456.entity.PageBean;
import com.java456.service.BlogFenLeiService;
import com.java456.util.ResponseUtil;
import com.java456.util.StringUtil;
import net.sf.json.JSONObject;



@Controller
@RequestMapping("/admin/blog/fenlei")
public class Admin_BlogFenLei_Controller {
	
	@Resource
	private BlogFenLeiService blogFenLeiService;
	
	
	
	/**
	 *  /admin/blog/fenlei/add
	 */
	@RequestMapping("/add")
	public String add(BlogFenLei fenlei, HttpServletResponse response, HttpServletRequest request) throws Exception {
		fenlei.setCreateDateTime(new Date());
		fenlei.setUpdateDateTime(new Date());
		
		int resultTotal = blogFenLeiService.add(fenlei);
		JSONObject result = new JSONObject();
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "添加成功");
		} else {
			result.put("success", false);
			result.put("msg", "添加失败");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	
	
	/**
	 *  /admin/blog/fenlei/update
	 */
	@RequestMapping("/update")
	public String update(BlogFenLei fenlei, HttpServletResponse response, HttpServletRequest request) throws Exception {
		fenlei.setUpdateDateTime(new Date());
		int resultTotal = blogFenLeiService.update(fenlei);
		JSONObject result = new JSONObject();
		
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "添加成功");
		} else {
			result.put("success", false);
			result.put("msg", "添加失败");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	
	
	/**
	 * /admin/blog/fenlei/list
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "limit", required = false) String rows,
			@RequestParam(value = "q", required = false) String q, 
			HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("q", StringUtil.formatLike(q));
		
		List<BlogFenLei> list = blogFenLeiService.list(map);
		Integer total = blogFenLeiService.getTotal(map);
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
	 *   /admin/blog/fenlei/delete
	 * @param ids
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
			throws Exception {
		String[] idsStr = ids.split(",");
		JSONObject result = new JSONObject();
		
		for (int i = 0; i < idsStr.length; i++) {
			blogFenLeiService.delete(Integer.parseInt(idsStr[i]));
		}
		result.put("success", true);
		ResponseUtil.write(response, result.toString());
		return null;
	}

	
	
	
	
}
