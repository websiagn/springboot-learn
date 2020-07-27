package com.example.springbootlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

//使用MapperScan批量扫描所有的Mapper接口
@MapperScan(value = "com.example.springbootlearn.mapper")
@SpringBootApplication
public class SpringbootLearnApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }

}
