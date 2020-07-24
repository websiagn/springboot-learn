package com.example.springbootlearn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("当前项目启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("当前项目停止");
    }
}
