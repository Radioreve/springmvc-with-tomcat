package com.radioreve.services;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserService {
  public List<String> getUsers() {
    return List.of("Jean", "Jack", "Gold");
  }
}
