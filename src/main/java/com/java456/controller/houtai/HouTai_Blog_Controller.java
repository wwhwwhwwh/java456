package com.java456.controller.houtai;


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
import com.java456.service.BlogFenLeiService;
import com.java456.service.BlogService;

@Controller
@RequestMapping("/houtai/blog")
public class HouTai_Blog_Controller {
	
	@Resource
	private BlogFenLeiService blogFenLeiService;
	@Resource
	private BlogService blogService;
	
	/**
	 *   /houtai/blog/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<BlogFenLei> blogFenLeiList = blogFenLeiService.list(map );
		
		mav.addObject("blogFenLeiList", blogFenLeiList);
		
		mav.setViewName("/admin/page/blog/blog_manage");
		return mav;
	}
	
	
	/**
	 *    /houtai/blog/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("title", "添加文章");
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<BlogFenLei> blogFenLeiList = blogFenLeiService.list(map );
		mav.addObject("blogFenLeiList", blogFenLeiList);
		
		
		mav.addObject("btn_text", "添加");
		mav.addObject("save_url", "/admin/blog/add");
		mav.setViewName("/admin/page/blog/add_or_update");
		return mav;
	}
	
	
	/**
	 * /houtai/blog/edit
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<BlogFenLei> blogFenLeiList = blogFenLeiService.list(map );
		mav.addObject("blogFenLeiList", blogFenLeiList);
		Blog blog = blogService.findById(Integer.parseInt(id));
		mav.addObject("title", "修改文章-"+blog.getTitle());
		
		mav.addObject("isEdit", true);
		
		mav.addObject("blog", blog);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/blog/update?id="+id);
		mav.setViewName("/admin/page/blog/add_or_update");
		return mav;
	}
	
	
}
