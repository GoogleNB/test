package com.mapper;

import com.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/16 13:25
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：UserMapper.java
 * @Software：IntelliJ IDEA
 */
/**
 * 根据用户名和密码返回用户对象
 */
public interface UserMapper {
    @Select("select * from user where name = #{name} and password = #{password}")
    User select(@Param("name") String name,@Param("password") int password);
    @Insert("insert into user   value(null,#{name},#{password});")
    void insert(@Param("name") String name, @Param("password") int password);
    @Select("select * from user where name =#{name}")
    User selectName(String name);
}
