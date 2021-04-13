package com.nut.web;

import com.nut.entity.User;
import com.nut.service.UserService;
import com.nut.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:54
 */
@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("utf-8");
        //获取请求参数Map
        Map<String, String[]> parameterMap = request.getParameterMap();

        //封装对象
        User user = new User();
        try
        {
            BeanUtils.populate(user,parameterMap);
        }
        catch (IllegalAccessException | InvocationTargetException e)
        {
            e.printStackTrace();
        }

        System.out.println("user = " + user);

        //调用service层
        UserService userService = new UserServiceImpl();
        userService.updateUser(user);

        //重定向
        response.sendRedirect(request.getContextPath()+"/queryUserServlet");
    }
}
