package com.java456.controller.houtai;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java456.entity.DownFenLei;
import com.java456.entity.Link;
import com.java456.service.DownFenLeiService;



@Controller
@RequestMapping("/houtai/down/fenlei")
public class HouTai_Down_FenLei_Controller {
	
	@Resource
	private DownFenLeiService downFenLeiService;
	
	/**
	 *   /houtai/down/fenlei/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageTitle", "用户管理");
		mav.addObject("title", "用户管理");
		mav.setViewName("/admin/page/down_fenlei/down_fenlei_manage");
		return mav;
	}
	
	
	
	/**
	 * /houtai/down/fenlei/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("btn_text", "添加");
		mav.addObject("save_url", "/admin/down/fenlei/add");
		mav.setViewName("/admin/page/down_fenlei/add_or_update");
		return mav;
	}
	
	/**
	 * /houtai/down/fenlei/edit
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		DownFenLei fenlei = downFenLeiService.findById(Integer.parseInt(id));
		mav.addObject("fenlei", fenlei);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/down/fenlei/update?id="+id);
		mav.setViewName("/admin/page/down_fenlei/add_or_update");
		return mav;
	}
	
}
