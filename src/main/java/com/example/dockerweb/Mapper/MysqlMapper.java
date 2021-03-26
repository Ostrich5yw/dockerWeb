package com.example.dockerweb.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MysqlMapper {
    @Select("select age from hellomysql where name = '5yw'")
    int selectMysql();

    @Update("update hellomysql set age = age + 1 where name = '5yw'")
    void changeMysql();
}
