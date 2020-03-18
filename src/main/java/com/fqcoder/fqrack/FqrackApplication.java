package com.fqcoder.fqrack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.fqcoder.fqrack.dao")
public class FqrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FqrackApplication.class, args);
    }

}
