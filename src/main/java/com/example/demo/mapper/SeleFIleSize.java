package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface SeleFIleSize {
    public Map<String,Object> getFilesize(@Param("dzwjdx") String dzwjdx,@Param("tablename") String tablename,@Param("espath") String espath);
    public Map<String,Object> getAllFilesize(@Param("dzwjdx") String dzwjdx,@Param("tablename") String tablename);
}
