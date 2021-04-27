package com.example.demo.mapper;

import com.example.demo.Entity.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface TreeMapper {

    public List<Tree> Sel();

    public List<Tree> SelTree();

}
