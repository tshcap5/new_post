package com.example.post;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.post")
public class PostApplication extends SpringBootServletInitializer  {

    public PostApplication() {
        super();
        setRegisterErrorPageFilter(false); // <- this one
    }

    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class, args);
    }

}
