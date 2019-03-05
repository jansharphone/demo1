package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxiaofeng
 * @create 2018-03-05 9:39
 * @description
 **/

@RestController
public class DemoController {

    @RequestMapping("/index")
    public String begin(){
        return  "Hello World";
    }

}
