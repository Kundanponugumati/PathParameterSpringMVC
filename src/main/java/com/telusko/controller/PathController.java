package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class PathController {

//    url= //localhost:8080/getMessage?name=kundan
    // here @RequestParam("x") is not mandatory if x matches with url key.
    @GetMapping("/getMessage")
    public String displaySomeMessage(@RequestParam("name") String name , Map<String,Object> model)
    {
        String message = "Hello "+name+" I hope you're enjoying the course";
        model.put("msg",message);
        return "index";
    }

    //localhost:8080/dispMessage?name=kundan&course=springboot

    @GetMapping("/dispMessage")
    public String displayMessage(@RequestParam("name") String name ,@RequestParam("course") String course , Map<String,Object> model)
    {
        String message = "Hello "+name+" I hope you're enjoying the course "+course;
        model.put("msg",message);
        return "index";
    }
}
