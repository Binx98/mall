package com.xu.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 徐志斌
 * @Date: 2024/11/2 9:43
 * @Version 1.0
 * @Description: TestController
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/user")
    public String test() {
        return "USER Moudule";
    }
}
