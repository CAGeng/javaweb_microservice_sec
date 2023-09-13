package com.l4yn3.microserviceseclab.mapper;

import com.l4yn3.microserviceseclab.data.Student2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IStudent2Mapper {
    @Select("select * from student2s where name ='${name}'")
    public List<Student2> query2(@Param(value = "name") String username);
}
