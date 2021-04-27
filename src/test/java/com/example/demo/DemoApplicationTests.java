package com.example.demo;

import com.example.demo.Entity.Tree;
import com.example.demo.mapper.TagMapper;
import com.example.demo.service.TreeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {


  @Autowired
  private TreeService treeService;
    @Test
    public void  Sel(){


        System.out.println(treeService.Sel());
    }

    @Test
    public void  SelTree(){

        Tree aa=   treeService.SelTree();



        System.out.println(aa.toString());
    }


    @Test
    public void  getcjsj(){

        System.out.println(treeService.getcjsj("596"));


    }

/*    @Test
    public void  createtime()  {

        System.out.println(treeService.getrgl());


    }*/



}
