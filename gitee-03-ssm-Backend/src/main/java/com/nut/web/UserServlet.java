package com.nut.web;

import com.nut.config.SpringConfiguration;
import com.nut.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 15:34
 */
@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        //ApplicationContext applicationContext =
        //        new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ServletContext servletContext = this.getServletContext();
        ApplicationContext applicationContext = (ApplicationContext)servletContext.getAttribute("app");
        //ApplicationContext applicationContext =
        //        WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.show();
    }
}
