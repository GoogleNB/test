package com.neu.controller;

import com.neu.pojo.User;
import com.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户管理Controller
 * @author Admin
 *
 */
@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView  index(HttpServletRequest request) {
		//代码编写处
		ModelAndView mv = new ModelAndView();
		String suer = (String) request.getSession().getAttribute("user");
		if (suer != null) {
			List<User> users = userService.getUsers();
			mv.addObject("userList",users);
			mv.setViewName("/users");
			return mv;
		}
		else
		mv.setViewName("redirect:/index");

		return mv; //请修改代码
	}


}
