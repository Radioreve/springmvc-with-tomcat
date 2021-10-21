package com.radioreve.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/lja")
  public String sayHello() {
    return "Hello LJA";
  }
}