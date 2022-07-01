package com.neu.service;

import com.neu.mapper.UserMapper;
import com.neu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User getUser(String userName) {
		return userMapper.findUserByName(userName);
	}

	/**
	 * 登录验证方法的实现
	 */
	public boolean isLogin(User user) {
	
		//代码编写处
		User userByName = userMapper.findUserByName(user.getUserName());
		if (userByName!=null)
			return Objects.equals(userByName.getUserName(), user.getUserName()) && Objects.equals(userByName.getPassword(), user.getPassword());


		return false; //请自行修改代码
	}

	public List<User> getUsers() {
		
		return userMapper.findAll();
	}

}
