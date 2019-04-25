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
import com.java456.entity.Memo;
import com.java456.entity.MemoFenLei;
import com.java456.service.MemoFenLeiService;
import com.java456.service.MemoService;


@Controller
@RequestMapping("/houtai/memo")
public class HouTai_Memo_Controller {

	@Resource
	private MemoService memoService;
	
	@Resource
	private MemoFenLeiService memoFenLeiService;
	/**
	 *   /houtai/mome/manage
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<MemoFenLei> memoFenLeiList = memoFenLeiService.list(map );
		mav.addObject("memoFenLeiList", memoFenLeiList);
		
		mav.setViewName("/admin/page/memo/memo_manage");
		return mav;
	}
	
	
	/**
	 * /houtai/mome/add
	 */
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<MemoFenLei> memoFenLeiList = memoFenLeiService.list(map );
		mav.addObject("memoFenLeiList", memoFenLeiList);
		
		mav.addObject("btn_text", "Ìí¼Ó");
		mav.addObject("save_url", "/admin/memo/add");
		mav.setViewName("/admin/page/memo/add_or_update");
		
		return mav;
	}
	
	
	/**
	 * /houtai/mome/edit?id=3
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<MemoFenLei> memoFenLeiList = memoFenLeiService.list(map );
		mav.addObject("memoFenLeiList", memoFenLeiList);
		
		Memo memo = memoService.findById(Integer.parseInt(id));
		mav.addObject("memo", memo);
		mav.addObject("btn_text", "ÐÞ¸Ä");
		mav.addObject("save_url", "/admin/memo/update?id="+id);
		mav.setViewName("/admin/page/memo/add_or_update");
		
		return mav;
	}
	
	
	
	
}
