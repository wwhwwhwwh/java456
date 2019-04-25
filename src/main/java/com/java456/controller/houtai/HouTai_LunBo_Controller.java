package com.java456.controller.houtai;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java456.entity.Link;
import com.java456.entity.LunBo;
import com.java456.service.LunBoService;


@Controller
@RequestMapping("/houtai/lunbo")
public class HouTai_LunBo_Controller {
	
	
	@Resource
	private LunBoService lunBoService;
	
	/**
	 * /houtai/lunbo/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/page/lunbo/lunbo_manage");
		return mav;
	}
	
	/**
	 * /houtai/lunbo/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("btn_text", "Ìí¼Ó");
		mav.addObject("save_url", "/admin/lunbo/add");
		mav.setViewName("/admin/page/lunbo/add_or_update");
		return mav;
	}
	
	/**
	 * /houtai/lunbo/edit
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		LunBo lunbo = lunBoService.findById(Integer.parseInt(id));
		mav.addObject("lunbo", lunbo);
		mav.addObject("btn_text", "ÐÞ¸Ä");
		mav.addObject("save_url", "/admin/lunbo/update?id="+id);
		mav.setViewName("/admin/page/lunbo/add_or_update");
		return mav;
	}
	
}
