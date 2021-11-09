package com.radioreve.servlets;

import com.radioreve.services.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

// This is the only code that is required to have a
// servlet working behind an app container like tomcat
// No configuration, no nothing! Beautiful.
@WebServlet(urlPatterns = "/simpled")
@Component
@NoArgsConstructor
public class SimpleServlet extends HttpServlet {

  private UserService userService;

  @Override
  public void doGet(
      HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    res.getWriter().println("Hello");
  }
}