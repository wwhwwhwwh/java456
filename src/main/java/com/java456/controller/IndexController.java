package com.java456.controller;


import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.java456.entity.Blog;
import com.java456.entity.BlogFenLei;
import com.java456.entity.LunBo;
import com.java456.entity.User;
import com.java456.service.BlogFenLeiService;
import com.java456.service.BlogService;
import com.java456.service.LunBoService;
import com.java456.service.PublicService;
import com.java456.util.CryptographyUtil;
import com.java456.util.DateUtil;
import com.java456.util.FileUtil;
import com.java456.util.MyUtil;
import com.java456.util.QRcodeUtil;
import com.java456.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/")
public class IndexController {
	
	
	@Resource
	private PublicService publicService;
	@Resource
	private LunBoService lunBoService;
	@Resource
	private BlogFenLeiService blogFenLeiService;
	@Resource
	private BlogService blogService;
	
	/**
	 * /index
	 * ������ҳ
	 */
	@RequestMapping("/index")
	public ModelAndView index(HttpServletResponse  res,HttpServletRequest req) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		List<LunBo> lunboList = lunBoService.index_list();
		mav.addObject("lunboList", lunboList);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		map.put("pos", 1);
		List<BlogFenLei> baseModuleList = blogFenLeiService.list(map);
		
		mav.addObject("baseModuleList", baseModuleList);
		
		
		mav.setViewName("/pc/index");
		return mav;
	}
	
	
	
	/**
	 * ���Ե�½
	 */
	@RequestMapping("/login")
	public ModelAndView login(HttpServletResponse  res,HttpServletRequest req) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		String UserAgent = req.getHeader("User-Agent");
		//�ж�AppleWebKit ��  Firefox
		
		if(MyUtil.checkUserAgent(UserAgent)){
			mav.setViewName("/pc/login/login");
		}else{
			mav.setViewName("/admin/common/s_mode");
		}
		return mav;
	}
	
	
	
	/**
	 * ��̨��ҳ
	 */
	@RequestMapping("/admin/main")
	public ModelAndView admin_main(HttpServletResponse  res,HttpServletRequest req) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		
		
		publicService.addLeftMenu(mav);
		
		System.out.println(MyUtil.getRemoteAddress(req));
		
		String UserAgent = req.getHeader("User-Agent");
		if(MyUtil.checkUserAgent(UserAgent)){
			mav.setViewName("/admin/main");
		}else{
			mav.setViewName("/admin/common/s_mode");
		}
		return mav;
	}
	
	
	/**
	 * /qrcode/create
	 * @param content
	 *  ������ת�ɶ�ά�뷵��
	 */
	@RequestMapping("/qrcode/create")
	public String getQRCode(@RequestParam(value = "content", required = false) String content,
			HttpServletRequest requset, HttpServletResponse response) throws Exception {
		
		// ���ɶ�ά��QRCodeͼƬ
		BufferedImage bufImg = QRcodeUtil.qRCodeCommon(content, "jpg", QRcodeUtil.getSize(content));
		// ���浽����
		String fileName = DateUtil.formatDate(new Date(), "yyyyMMddHHmmssSSS");
		String path = requset.getSession().getServletContext().getRealPath("");
		String file_path = "/static/upload_image/qrcode/";
		
		path = path +file_path ;
		FileUtil.makeDirs(path);
		try {
			// ��img�浽���������档 ���ص�ַ������
			ImageIO.write(bufImg, "jpg", new File(path + fileName + ".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		result.put("path", file_path+fileName + ".jpg");
		result.put("msg", "�뽫��ά��ͼƬ���浽�ֻ�����,���ߵ��� ");
		ResponseUtil.write(response, result.toString());
		// ImageIO.write(bufImg, "jpg", response.getOutputStream());
		return null;
	}
	
	
	/**
	 * /index_base_module?blogFenLeiId1&rows=10
	 * �õ���ҳ  ����ģ�������
	 */
	@RequestMapping("/index_base_module")
	public String index_base_module(@RequestParam(value = "blogFenLeiId", required = false) Integer blogFenLeiId
			,@RequestParam(value = "rows", required = false) Integer rows,HttpServletResponse response,HttpServletRequest request
			,RedirectAttributes attr)throws Exception{
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("isUse", 1);
			map.put("blogFenLeiId", blogFenLeiId);
			map.put("start", 0);
			map.put("size", rows);
			List<Blog> blogList = blogService.list2(map);
			
			Gson gson = new GsonBuilder().setDateFormat("MM-dd").create();
			
			ResponseUtil.write(response, gson.toJson(blogList));
			return null;
	}
	
	
	
	
	
}
