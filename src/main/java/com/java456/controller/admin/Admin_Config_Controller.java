package com.java456.controller.admin;

import java.io.File;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.google.gson.Gson;
import com.java456.entity.Config;
import com.java456.service.ConfigService;
import com.java456.util.ResponseUtil;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin/config")
public class Admin_Config_Controller {
	
	@Resource
	private ConfigService configService;
	
	@RequestMapping("/update")
	public String update(Config config,HttpServletResponse response,HttpServletRequest request)throws Exception{
		
		int resultTotal=configService.update(config);
		JSONObject result = new JSONObject();
		
		if(resultTotal>0){
			result.put("success", true);
			result.put("msg", "修改成功");
		}else{
			result.put("success", false);
			result.put("msg", "修改失败");
		}
		ResponseUtil.write(response, result.toString());
		return null;
	}
	
	
	@RequestMapping("/findById")
	public String findById(
			@RequestParam(value="id",required=false)String id,
			HttpServletResponse response,HttpServletRequest request)throws Exception{
		Gson gson = new Gson();
		Config config = configService.findById(Integer.parseInt(id));
		ResponseUtil.write(response, gson.toJson(config));
		return null;
	}
	
	
	/**
	 * /admin/config/add_houtai_logo
	 */
	@RequestMapping("/add_houtai_logo")
	public String add_houtai_logo(
	        @RequestParam(value="name",required=false)String name,
	        @RequestParam("file") MultipartFile file, 
	        HttpServletResponse response, HttpServletRequest request) throws Exception {
	        JSONObject result = new JSONObject();
	        
	        if(!file.isEmpty()){
	            String webPath=request.getServletContext().getRealPath("");
	            String filePath= "/static/upload_image/config/";
	            //把文件名子换成（时间搓.png）
	            // String imageName="houtai_logo."+file.getOriginalFilename().split("\\.")[1];
	            String imageName="houtai_logo.jpg";
	            file.transferTo(new File(webPath+filePath+imageName));
	            result.put("success", true);
	            result.put("path", filePath+imageName);
	        }
	        ResponseUtil.write(response, result.toString());
	        return null;
	}
	
	
	/**
	 *  /admin/config/add_gzh
	 */
	@RequestMapping("/add_gzh")
	public String add_gzh(@RequestParam(value="name",required=false)String name,
	        @RequestParam("file2") MultipartFile file, 
	        HttpServletResponse response, HttpServletRequest request) throws Exception {
			JSONObject result = new JSONObject();
			
	        if(!file.isEmpty()){
	            String webPath=request.getServletContext().getRealPath("");
	            String filePath = "/static/upload_image/config/";
	            String imageName="gzh.jpg";
	            //把文件名子换成（时间搓.png）
	            
	            file.transferTo(new File(webPath+filePath+imageName));
	            result.put("success", true);
	            result.put("path", filePath+imageName);
	        }
	        
	        ResponseUtil.write(response,result.toString());
	        return null;
	}
	
	
	/**
	 * /admin/config/add_geren_erweima
	 */
	@RequestMapping("/add_geren_erweima")
	public String add_geren_erweima(
	        @RequestParam(value="name",required=false)String name,
	        @RequestParam("file3") MultipartFile file, 
	        HttpServletResponse response, HttpServletRequest request) throws Exception {
			JSONObject result = new JSONObject();
			
	        if(!file.isEmpty()){
	            String webPath=request.getServletContext().getRealPath("");
	            String filePath = "/static/upload_image/config/";
	            String imageName="geren_erweima.jpg";
	            //把文件名子换成（时间搓.png）
	            //String imageName=DateUtil.formatDate(new Date(), "yyyyMMddhhmmssSSS")+".jpg";
	            file.transferTo(new File(webPath+filePath+imageName));
	            result.put("success", true);
	            result.put("path", filePath+imageName);
	        }
	        
	        ResponseUtil.write(response,result.toString());
	        return null;
	}
	
	/**
	 * /admin/config/add_daohang_icon
	 */
	@RequestMapping("/add_logo")
	public String add_logo(
	        @RequestParam(value="name",required=false)String name,
	        @RequestParam("file4") MultipartFile file, 
	        HttpServletResponse response, HttpServletRequest request) throws Exception {
			JSONObject result = new JSONObject();
			
	        if(!file.isEmpty()){
	            String webPath=request.getServletContext().getRealPath("");
	            String filePath = "/static/upload_image/config/";
	            String imageName="logo.jpg";
	            //把文件名子换成（时间搓.png）
	            //String imageName=DateUtil.formatDate(new Date(), "yyyyMMddhhmmssSSS")+".jpg";
	            file.transferTo(new File(webPath+filePath+imageName));
	            result.put("success", true);
	            result.put("path", filePath+imageName);
	        }
	        
	        ResponseUtil.write(response,result.toString());
	        return null;
	}
	
	
	
	
	
	
	
}
