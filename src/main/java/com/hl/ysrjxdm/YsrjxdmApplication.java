package com.hl.ysrjxdm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hl.ysrjxdm.mapper")

public class YsrjxdmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsrjxdmApplication.class, args);
    }

}
