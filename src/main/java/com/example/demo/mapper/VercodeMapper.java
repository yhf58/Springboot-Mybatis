package com.example.demo.mapper;

import com.example.demo.entity.Vercode;

public interface VercodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vercode record);

    int insertSelective(Vercode record);

    Vercode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Vercode record);

    int updateByPrimaryKey(Vercode record);
}