package com.fqcoder.fqrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Created by FqCoder
 * @Date 2020/3/1 下午1:09
 * @Description TODO
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
