package com.boot.myspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hsj
 * @program: myspring
 * @description:
 * @create: 2018-12-01 16:25
 * @Modify By:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }
}
