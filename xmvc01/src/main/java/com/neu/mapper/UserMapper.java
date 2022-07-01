package com.neu.mapper;

import com.neu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
	
	/**
	 * 根据用户名称，在user表中查找一条记录
	 * @param userName 用户名
	 * @return 用户的一条记录
	 */
	public User findUserByName(String userName);
	
	/**
	 * 检索user表的所有记录
	 * @return 所有记录信息
	 */
	public List<User> findAll();

}
