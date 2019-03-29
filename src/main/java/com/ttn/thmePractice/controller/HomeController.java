package com.ttn.thmePractice.controller;

import com.ttn.thmePractice.entity.Employee;
import com.ttn.thmePractice.entity.User;
import com.ttn.thmePractice.entity.UserEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
@Controller
public class HomeController {

    List<Employee> employees = new ArrayList<>();
    List<User> users = new ArrayList<>();
    List<UserEnum> userEnums = new ArrayList<>();

    @GetMapping("sayHello")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Amarjeet Malik");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @GetMapping("form")
    public ModelAndView form() {
        ModelAndView form = new ModelAndView("form");
        form.addObject("employee", new Employee());
        return form;
    }

    @PostMapping("submit")
    public ModelAndView submitForm(Employee employee) {
        ModelAndView modelAndView = new ModelAndView("submit");
        employees.add(employee);
        modelAndView.addObject("employeeList", employees);
        return modelAndView;
    }

    @GetMapping("greet")
    public ModelAndView greet() {
        ModelAndView form = new ModelAndView("greet");
        form.addObject("user", new User());
        return form;
    }

    @PostMapping("greeting")
    public ModelAndView greeting(User user) {
        ModelAndView modelAndView = new ModelAndView("isAdminGreet");
        users.add(user);
        modelAndView.addObject("userList", users);
        return modelAndView;
    }

    @GetMapping("time")
    public String time() {
        return "time";
    }

    @GetMapping("enumPerson")
    public ModelAndView enumPerson() {
        ModelAndView modelAndView = new ModelAndView("person");
        modelAndView.addObject("enumPerson", new UserEnum());
        return modelAndView;
    }

    @PostMapping("enum")
    public ModelAndView enummessage(UserEnum userEnum) {
        ModelAndView modelAndView = new ModelAndView("enum");
        userEnums.add(userEnum);
        modelAndView.addObject("enumlist", userEnums);
        return modelAndView;

    }

    @GetMapping("onload")
    public String onload() {
        return "onload";
    }

    @PostMapping("/ajaxloader")
    @ResponseBody
    public String ajaxloader() throws InterruptedException {
        Thread.sleep(3000);
        return "data from ajax";
    }
}
