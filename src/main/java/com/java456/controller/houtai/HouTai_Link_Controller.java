package com.java456.controller.houtai;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java456.entity.Link;
import com.java456.entity.User;
import com.java456.service.LinkService;


@Controller
@RequestMapping("/houtai/link")
public class HouTai_Link_Controller {
	
	@Resource
	private LinkService linkService;
	
	/**
	 * /houtai/link/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageTitle", "用户管理");
		mav.addObject("title", "用户管理");
		mav.setViewName("/admin/page/link/link_manage");
		return mav;
	}
	
	
	/**
	 * /houtai/link/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("btn_text", "添加");
		mav.addObject("save_url", "/admin/link/add");
		mav.setViewName("/admin/page/link/add_or_update");
		return mav;
	}
	
	
	/**
	 * /houtai/link/edit
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		Link link = linkService.findById(Integer.parseInt(id));
		mav.addObject("link", link);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/link/update?id="+id);
		mav.setViewName("/admin/page/link/add_or_update");
		return mav;
	}
	
	
	
}
