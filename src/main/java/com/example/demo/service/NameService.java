package com.example.demo.service;

import com.example.demo.entity.Name;
import com.example.demo.entity.NameExample;
import com.example.demo.entity.User;
import com.example.demo.mapper.NameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class NameService {
    @Autowired
    private NameMapper nameMapper;
    public void  insertUser(Name name){
        try{
            NameExample example=new NameExample();
            nameMapper.insert(name);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {

        }
    }
    public  void deleteUser(Integer id){
        try{
            NameExample example=new NameExample();
            NameExample.Criteria criteria=example.createCriteria();
            criteria.andIdEqualTo(id);
            nameMapper.deleteByExample(example);
        }
        catch (Exception ex){

        }
        finally {

        }
    }

    public void modifyName(Name name){
        try{
            NameExample example=new NameExample();
            NameExample.Criteria criteria=example.createCriteria();
            criteria.andIdEqualTo(name.getId());
            nameMapper.updateByExampleSelective(name,example);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {

        }
    }

    public List<Name> queryUser(){

            NameExample example =new NameExample();
            NameExample.Criteria criteria=example.createCriteria();
            criteria.andIdEqualTo(1);
           return  nameMapper.selectByExample(example);

    }
}
