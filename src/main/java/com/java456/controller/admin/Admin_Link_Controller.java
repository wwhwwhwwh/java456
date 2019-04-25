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
import com.java456.entity.Link;
import com.java456.entity.PageBean;
import com.java456.entity.User;
import com.java456.service.LinkService;
import com.java456.util.CryptographyUtil;
import com.java456.util.ResponseUtil;
import com.java456.util.StringUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin/link")
public class Admin_Link_Controller {
	
	@Resource
	private LinkService linkService;
	
	/**
	 *  /admin/link/add
	 */
	@RequestMapping("/add")
	public String add(Link link  , HttpServletResponse response, HttpServletRequest request) throws Exception {
		link.setCreateDateTime(new Date());
		link.setUpdateDateTime(new Date());
		
		int resultTotal = linkService.add(link);
		JSONObject result = new JSONObject();
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "��ӳɹ�");
		} else {
			result.put("success", false);
			result.put("msg", "���ʧ��");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	/**
	 *  /admin/link/update
	 */
	@RequestMapping("/update")
	public String update(Link link, HttpServletResponse response, HttpServletRequest request) throws Exception {
		link.setUpdateDateTime(new Date());
		int resultTotal = linkService.update(link);
		JSONObject result = new JSONObject();
		
		if (resultTotal > 0) {
			result.put("success", true);
			result.put("msg", "��ӳɹ�");
		} else {
			result.put("success", false);
			result.put("msg", "���ʧ��");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	
	/**
	 * /admin/link/list
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
		
		List<Link> list = linkService.list(map);
		Integer total = linkService.getTotal(map);
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
		
		map.clear();
		map.put("data", list);
		map.put("count", total);
		map.put("code", 0);
		map.put("msg", "");
		ResponseUtil.write(response, gson.toJson(map));
		return null;
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
			throws Exception {
		String[] idsStr = ids.split(",");
		JSONObject result = new JSONObject();
		
		for (int i = 0; i < idsStr.length; i++) {
			linkService.delete(Integer.parseInt(idsStr[i]));
		}
		result.put("success", true);
		ResponseUtil.write(response, result.toString());
		return null;
	}

	
	
	
}
