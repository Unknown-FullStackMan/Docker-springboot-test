package com.simple.dockertest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simple
 * @date 2021/3/2 16:34
 */
@RestController
public class HelloController {

    @RequestMapping("/hellodocker")
    public String hello(){
        return "docker-test-success";
    }
}
