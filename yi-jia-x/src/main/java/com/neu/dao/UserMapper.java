package com.neu.dao;

import com.neu.pojo.User;

import java.util.List;

/**
 * @Date ：2022/5/7 15:08
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：UserMapper.java
 * @Software：IntelliJ IDEA
 */
public interface UserMapper {
    User findUserByName(String name);

     List <User> findAll();
}
