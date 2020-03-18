package com.fqcoder.fqrack.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Created by FqCoder
 * @Date 2020/3/1 下午1:08
 * @Description 登录接口
 */
public class LoginController {


    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
