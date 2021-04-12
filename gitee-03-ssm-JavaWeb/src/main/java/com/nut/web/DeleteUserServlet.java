package com.nut.web;

import com.nut.service.UserService;
import com.nut.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:56
 */
@WebServlet("/deleteUserServlet")
public class DeleteUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //获取JSP请求的数据
        String name = request.getParameter("name");

        //调用service服务
        UserService userService = new UserServiceImpl();
        userService.deleteUserByName(name);

        //重定向到查询界面
        response.sendRedirect(request.getContextPath()+"/queryUserServlet");

    }
}
