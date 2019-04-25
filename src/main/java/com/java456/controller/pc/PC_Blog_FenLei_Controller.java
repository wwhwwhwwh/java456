package com.java456.controller.pc;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java456.entity.Blog;
import com.java456.entity.BlogFenLei;
import com.java456.entity.PageBean;
import com.java456.service.BlogFenLeiService;
import com.java456.service.BlogService;


@Controller
@RequestMapping("/a/blog/fenlei")
public class PC_Blog_FenLei_Controller {
	
	@Resource
	private BlogFenLeiService blogFenLeiService;
	@Resource
	private BlogService blogService;
	
	
	/**
	 * /a/blog/fenlei/get?id=1&page=1
	 * ÇëÇóÖ÷Ò³
	 */
	@RequestMapping("/get")
	public ModelAndView get(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "rows", required = false) Integer rows,
			HttpServletResponse  res,HttpServletRequest req) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		if(page==null)page=1;
		if(rows==null)rows=100;
		
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		
		BlogFenLei blogFenLei = blogFenLeiService.findById(id);
		mav.addObject("blogFenLei", blogFenLei);
		
		PageBean pageBean = new PageBean(page, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		map.put("blogFenLeiId",id);
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Blog> blogList = blogService.list(map);
		Integer total = blogService.getTotal(map);
		mav.addObject("total", total);
		mav.addObject("blogList", blogList);
		
		mav.addObject("url", "/a/blog/fenlei/get?id="+id);
		
		mav.setViewName("/pc/blog_fenlei/blog_fenlei_index");
		return mav;
	}
	
	
	
}
