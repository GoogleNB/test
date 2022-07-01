package com.mapper;

import com.pojo.Brand;

import java.util.List;

public interface BrandMapper {

    List<Brand> selectAll();

    void add(Brand brand);
}
