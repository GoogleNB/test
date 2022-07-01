package com.mapper;

import com.User;

import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/9 13:33
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：WangMapper.java
 * @Software：IntelliJ IDEA
 */
public interface WangMapper {
    List<User> selectAll();

    User selectOne(String name);
}
