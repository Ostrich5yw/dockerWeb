package com.example.dockerweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dockerweb.Mapper")
public class DockerwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerwebApplication.class, args);
    }

}
