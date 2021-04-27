package com.example.demo.controller;


import com.example.demo.Entity.Tree;
import com.example.demo.Entity.TreeList;
import com.example.demo.service.TreeService;
import com.example.demo.util.Layui;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class TreeController {
    @Autowired
    private TreeService treeService;

/*
    @RequestMapping(value = "/getTree", method = RequestMethod.POST)
    @ResponseBody

    public Layui  SelTree(){

       Tree tree = treeService.SelTree();
        String aa=    tree.toString().replaceAll("=",":").replaceAll("Tree","");
        Layui.data(aa);
        return Layui.data(aa);
    }*/


    @RequestMapping(value = "/getTree")
    public String  SelTree(){

        Tree tree = treeService.SelTree();
        String aa=    tree.toString().replaceAll("=",":").replaceAll("Tree","");
        String bb= "["+aa+"]";
        return aa;
    }

    //获取前端勾选树结构内容

    @RequestMapping(value = "/treeList")
    @ResponseBody
    public Object getList(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize){
        List<TreeList>  lists= new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(lists);
        String aa=jsonArray.toString();
        String bb="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+aa+"}";
        return  bb;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public  String    getData(String data){

        System.out.println("====="+data);
        String is="aa";
        List<TreeList>   lists = treeService.getdata(data,is);
        System.out.println("输出一下"+lists);
        JSONArray jsonArray = JSONArray.fromObject(lists);

        String aa=jsonArray.toString();
        String bb="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+aa+"}";

     //  String cc="{\"sendUserId\":\"+SENDER+\" ,\"loginNames\":\"+RECEVIER+\",\"content\":\"+CONTENT+\",\"url\":\"[]\"}";
        return  bb;
    }




    //首次加载列表
    //首次加载列表
/*    @RequestMapping(value = "/treeList")
    @ResponseBody
    public Object getList(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize){
        JSONArray jsonArray = JSONArray.fromObject(lists);
        String aa=jsonArray.toString();
        String bb="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+aa+"}";
        return  bb;
    }*/

//初始化表格代码
/*
  @RequestMapping(value = "/gettable")
    public  String   gettable(){
       List<TreeList>      lists=null;
       JSONArray jsonArray = JSONArray.fromObject(lists);
       String aa=jsonArray.toString();
       String bb="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+aa+"}";
        return  bb;
    }
*/




}
