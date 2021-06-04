package com.springboot.hello.sample.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@RequestMapping("/")
    public String getEmployees() 
    {
		return "Hello there";
    }
    
    @RequestMapping("/{username}")
    public String getEmployees(@PathVariable String username) 
    {
		return "Hello " + username;
    }

}