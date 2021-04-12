package com.nut.web;

import com.nut.entity.User;
import com.nut.service.UserService;
import com.nut.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-12 10:02
 */
@WebServlet("/queryUserByNameServlet")
public class QueryUserByNameServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //获取JSP提交的数据
        String name = request.getParameter("name");

        //调用service层
        UserService userService = new UserServiceImpl();
        User user = userService.queryUserByName(name);

        //存储，转发
        request.setAttribute("user",user);
        request.getRequestDispatcher("/jsp/updateUser.jsp").forward(request,response);
    }
}
