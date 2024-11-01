package com.xu.good;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类要在 package 统计，这样才能扫描 Bean
 */
@SpringBootApplication
public class GoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodApplication.class, args);
    }

}
