package com.example.demo.mapper;

import com.example.demo.Entity.Tag;
import com.example.demo.Entity.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface TagMapper {

    public List<Tag> Getcjsj(String id_structure);

    public List<Tag> Getbgqx(String id_structure);

    public List<Tag> getdzwj(String id_structure);
}
