package com.soccerfield.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.service.UserService;

/**
 * 
 * Title:PicuploadController
 * 
 * @author SinAmber Feng
 * @date 2018年4月3日上午11:03:04
 *
 */
@Controller
@RequestMapping("/pic")
public class PicuploadController {
	
	@Resource
	public UserService userService;
	
	//获取照片
	@RequestMapping("/getpic")
	@ResponseBody
	public void getPic(){
		
	}
	

}
