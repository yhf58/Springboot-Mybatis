package com.example.demo.mapper;

import com.example.demo.entity.Name;
import com.example.demo.entity.NameExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NameMapper {
    int countByExample(NameExample example);

    int deleteByExample(NameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Name record);

    int insertSelective(Name record);

    List<Name> selectByExample(NameExample example);

    Name selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Name record, @Param("example") NameExample example);

    int updateByExample(@Param("record") Name record, @Param("example") NameExample example);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);
}