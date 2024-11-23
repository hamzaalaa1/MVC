package com.springmvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class webInit implements WebApplicationInitializer   {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
      XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
      applicationContext.setConfigLocation("mvc1-servlet.xml");
     
    }
    
}
