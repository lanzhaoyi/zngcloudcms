package com.zngcloudcms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zngcloudcms.model.RetInfo;
import com.zngcloudcms.model.Role;
import com.zngcloudcms.service.IRoleService;
import com.zngcloudcms.service.IUserService;

/**
 * 用户认证
 * 
 * @ClassName: AccountController
 * @author: lanzhaoyi
 * @date: 2016年5月24日 下午5:57:23
 * 
 */
@Controller
@RequestMapping("/account")
public class AccountController {
	Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private IUserService userService;

	@Autowired
	private IRoleService roleService;

	@RequestMapping("/login")
	public ModelAndView login(String userName, String userPwd,
			HttpServletRequest request, HttpServletResponse response,
			Model model) throws Exception {
		logger.info("登陆");
		/*
		 * User user=new User(); user.setuID(15); user.setPwd("123456");
		 * user.setUserName("test");
		 */
		Role role = new Role();
		role.setId(200);
		role.setCode("200");
		role.setName("test");
		RetInfo objRetInfo = roleService.createRole(role);
		ModelAndView modelAndView = new ModelAndView();
		if (objRetInfo != null && objRetInfo.getRetCode() == 0) {
			modelAndView.setViewName("redirect:index");
		} else {
			modelAndView.setViewName("login");
		}
		modelAndView.addObject("msginfo", objRetInfo.getRetDescript());
		return modelAndView;
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		logger.info("退出");
		return "login";
	}

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		logger.info("主页面");
		logger.debug("主页面DEBUG");
		System.out.println("-||-" + request.getRequestURI());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello World!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
