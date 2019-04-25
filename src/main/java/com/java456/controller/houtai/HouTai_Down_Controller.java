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
import com.java456.entity.Down;
import com.java456.entity.DownFenLei;
import com.java456.service.BlogFenLeiService;
import com.java456.service.BlogService;
import com.java456.service.DownFenLeiService;
import com.java456.service.DownService;

@Controller
@RequestMapping("/houtai/down")
public class HouTai_Down_Controller {
	
	@Resource
	private DownFenLeiService downFenLeiService;
	@Resource
	private DownService downService;
	
	/**
	 *   /houtai/down/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<DownFenLei> downFenLeiList = downFenLeiService.list(map );
		mav.addObject("downFenLeiList", downFenLeiList);
		
		mav.setViewName("/admin/page/down/down_manage");
		return mav;
	}
	
	
	/**
	 *    /houtai/down/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("title", "添加软件下载");
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<DownFenLei> downFenLeiList = downFenLeiService.list(map );
		mav.addObject("downFenLeiList", downFenLeiList);
		
		
		mav.addObject("btn_text", "添加");
		mav.addObject("save_url", "/admin/down/add");
		mav.setViewName("/admin/page/down/add_or_update");
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
		List<DownFenLei> downFenLeiList = downFenLeiService.list(map );
		mav.addObject("downFenLeiList", downFenLeiList);
		
		
		Down down = downService.findById(Integer.parseInt(id));
		mav.addObject("title", "修改软件下载-"+down.getTitle());
		
		mav.addObject("isEdit", true);
		
		mav.addObject("down", down);
		mav.addObject("btn_text", "修改");
		mav.addObject("save_url", "/admin/down/update?id="+id);
		mav.setViewName("/admin/page/down/add_or_update");
		return mav;
	}
	
	
}
