package org.ljs.springexam01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.ljs.springexam01.dto.SampleDTO;

import java.util.List;


public interface SampleMapper {

    @Select("select now()")
    public String getTime();

//    @Select("select * from tbl_sample")
    public List<SampleDTO> getList();

}
