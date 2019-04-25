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
import com.java456.service.BlogService;

@Controller
@RequestMapping("/a/blog")
public class PC_Blog_Controller {

	@Resource
	private BlogService blogService;

	/**
	 * /a/blog/get?id=1
	 */
	@RequestMapping("/get")
	public ModelAndView get(@RequestParam(value = "id", required = false) Integer id, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
		ModelAndView mav = new ModelAndView();
		Blog blog = blogService.findById(id);
		mav.addObject("blog", blog);

		blog.setClickHit(blog.getClickHit() + 1);
		blogService.update(blog);
		
		switch (blog.getDisplay_mode()) {
		case 0:
			mav.setViewName("/pc/blog/blog_base");
			break;
		case 1:
			mav.setViewName("/pc/blog/blog_full");
			break;
		case 2:
			mav.setViewName("/pc/blog/wap_blog");
			break;
		case 3:
			mav.setViewName("/pc/blog/blog_base_no_nav");
			break;
		case 4:
			mav.setViewName("/pc/blog/blog_full_no_nav");
			break;
		}
		return mav;
	}

}
