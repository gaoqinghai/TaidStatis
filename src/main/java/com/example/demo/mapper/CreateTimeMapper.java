package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface CreateTimeMapper {

    public List<Map<String,Object>> createtime(@Param("cjsj")String cjsj, @Param("id_structure") String id_structure);
 }
