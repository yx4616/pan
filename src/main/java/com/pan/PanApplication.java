package com.pan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.pan.mapper")
@SpringBootApplication()
public class PanApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanApplication.class, args);
    }

}
