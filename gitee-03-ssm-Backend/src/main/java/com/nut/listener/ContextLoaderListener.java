package com.nut.listener;

import com.nut.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 15:43
 */
public class ContextLoaderListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        ServletContext servletContext = sce.getServletContext();

        //读取web.xml中的全局参数(读取字符串)
        //String contextConfiguration = servletContext.getInitParameter("contextConfiguration");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        servletContext.setAttribute("app",applicationContext);
        System.out.println("Spring容器创建结束");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {

    }
}
