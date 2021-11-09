package com.radioreve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/home")
  public String sayHello() {
    return "home";
  }

  @GetMapping("/home2")
  public String sayHello2() {
    return "home";
  }
}