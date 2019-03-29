package com.ttn.thmePractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {
//    public String name="a";

    @GetMapping("sayHello")
    public ModelAndView sayHello() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","Amarjeet Malik");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}

