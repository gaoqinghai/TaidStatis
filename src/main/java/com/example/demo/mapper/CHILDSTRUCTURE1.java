package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
@Mapper
public interface CHILDSTRUCTURE1 {

    public Map<String,Object>  getfile1(@Param("id_structure") String id_structure);
}
