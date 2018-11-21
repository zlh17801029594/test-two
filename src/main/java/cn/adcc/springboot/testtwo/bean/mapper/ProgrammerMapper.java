package cn.adcc.springboot.testtwo.bean.mapper;

import cn.adcc.springboot.testtwo.bean.Programmer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProgrammerMapper {

    @Select("select * from programmer")
    List<Programmer> findAll();
}
