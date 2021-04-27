package com.example.demo.util;

import com.example.demo.Entity.Tree;

import java.util.HashMap;
import java.util.List;

public class Layui extends HashMap {

    public static Layui data(String data){

        Layui r = new Layui();
        r.put("data", data);
        return r;

    }

}
