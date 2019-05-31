package com.liu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liu
 * @date 2019/2/26 16:08
 */
@RestController
@RequestMapping("/v1")
public class index {


    @GetMapping("/demo")
    public String demo(){
        return "hello 脑婆";
    }
}
