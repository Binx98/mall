package com.xu.good.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 徐志斌
 * @Date: 2024/11/1 20:56
 * @Version 1.0
 * @Description: TestController
 */
// 你想要使用 @RestController，要引入 web 依赖
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "SUCCESS";
    }
}
