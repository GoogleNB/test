package com.neu.controller;

import com.neu.pojo.User;
import com.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录功能Controller
 * @author Admin
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String  getIndex() {
		return "login";
	}
	
	/**
	 * 登录验证
	 * @param user 用户信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String getLogin(User user,HttpServletRequest request) {
		//代码编写处
		boolean login = userService.isLogin(user);
		if (login){
			request.getSession().setAttribute("user",user.getUserName());
			return "forward:/users/index";
		}

		return "forward:/index"; //注意修改代码
	}

}
