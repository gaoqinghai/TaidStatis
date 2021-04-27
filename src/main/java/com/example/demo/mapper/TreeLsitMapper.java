package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
@Mapper
public interface TreeLsitMapper {
    public Map<String,Object> selectzs(@Param("id_structure") String id_structure, @Param("bgqx") String bgqx, @Param("bgqxjt") String bgqxjt, @Param("espath") String espath);
    public Map<String,Object> selectqb(@Param("id_structure") String id_structure,  @Param("espath") String espath);
}
