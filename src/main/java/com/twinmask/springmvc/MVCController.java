package com.twinmask.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mvc")
public class MVCController {

    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("进来了");
        return "index";
    }
}
