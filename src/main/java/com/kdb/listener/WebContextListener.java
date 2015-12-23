package com.kdb.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class WebContextListener implements ServletContextListener {
    public WebContextListener() {
    }

    public void contextInitialized(ServletContextEvent contextEvent) {
        ServletContext context = contextEvent.getServletContext();

        System.setProperty("spring.conf.path", "file:" + context.getRealPath("/WEB-INF/conf"));
    }

    public void contextDestroyed(ServletContextEvent contextEvent) {

    }
}
