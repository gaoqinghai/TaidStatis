package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface SeleteFileTable {
   //获取档案系统内所有的电子文件级表名称
    public List<Map<String,Object>> SeleteFileTable();
}
