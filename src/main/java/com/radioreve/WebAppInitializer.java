package com.radioreve;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext container) {

    // Load Spring web application configuration
    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    ctx.register(WebAppInitializerConfig.class);
    ctx.setServletContext(container);

    // Register and map the dispatcher servlet
    DispatcherServlet servlet = new DispatcherServlet(ctx);
    ServletRegistration.Dynamic registration = container.addServlet("app", servlet);
    registration.setLoadOnStartup(1);
    registration.addMapping("/");
  }
}