package com.example.demo.controller;

import com.example.demo.entity.Name;
import com.example.demo.service.NameService;
import com.example.demo.service.UserService;
import com.example.demo.util.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.events.Namespace;
import java.rmi.server.ExportException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/name")
public class NameController {
    @Autowired
    private NameService nameService;
    @RequestMapping("/inserName")
    public Map<String,Object> insertname(Name name){
        Map<String,Object> result=new HashMap<String,Object>();
        nameService.insertUser(name);
        result.put("code",0);
        result.put("msg","添加查改");
        try{

        }
        catch (Exception ex){
            ex.printStackTrace();
            result.put("code",-1);
            result.put("msg",ex.getMessage());

        }
       return result;
    }

    @RequestMapping("/deleteName")
    public Map<String,Object> insertname(Integer id){
        Map<String,Object> result=new HashMap<String,Object>();
        nameService.deleteUser(id);
        result.put("code",0);
        result.put("msg","删除成功");
        try{

        }
        catch (Exception ex){
            ex.printStackTrace();
            result.put("code",-1);
            result.put("msg",ex.getMessage());

        }
        return result;
    }

    @RequestMapping("/modifyName")
    public Map<String,Object> modifyName(Name name){
        Map<String,Object> result=new HashMap<String,Object>();
        nameService.modifyName(name);
        result.put("code",0);
        result.put("msg","修改成功");
        try{

        }
        catch (Exception ex){
            ex.printStackTrace();
            result.put("code",-1);
            result.put("msg",ex.getMessage());

        }
        return result;
    }

    @RequestMapping("/queryName")
    public Map<String,Object> queryName(){
        Map<String,Object> result=new HashMap<String,Object>();
       List<Name> list=nameService.queryUser();
        result.put("code",0);
        result.put("msg","成功出现");
        result.put("data",list);
        try{

        }
        catch (Exception ex){
            ex.printStackTrace();
            result.put("code",-1);
            result.put("msg",ex.getMessage());
        }
        return result;
    }

    @RequestMapping(value ="/getIp",method = RequestMethod.GET)
    @ResponseBody
    public String getIP(HttpServletRequest request){
        return request.getRemoteHost();
    }


}
