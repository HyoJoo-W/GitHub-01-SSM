package com.nut.web;

import com.nut.entity.User;
import com.nut.service.UserService;
import com.nut.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:55
 */
@WebServlet("/queryUserServlet")
public class QueryUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //调用service层服务
        UserService userService = new UserServiceImpl();
        List<User> userList = userService.findAll();

        //存入request
        request.setAttribute("userList",userList);

        //转发
        request.getRequestDispatcher("/jsp/queryUser.jsp").forward(request,response);
    }

}
