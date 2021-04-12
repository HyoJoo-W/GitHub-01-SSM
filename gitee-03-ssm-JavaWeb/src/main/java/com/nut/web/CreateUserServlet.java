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
 * @ createDate : 2021-04-11 13:41
 */
@WebServlet("/createUserServlet")
public class CreateUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //1.设置编码
        request.setCharacterEncoding("utf-8");

        //2.获取JSP请求的数据
        Map<String, String[]> parameterMap = request.getParameterMap();

        //3.封装User并调用service层处理
        User user = new User();
        try
        {
            BeanUtils.populate(user,parameterMap);
        }
        catch (IllegalAccessException | InvocationTargetException e)
        {
            e.printStackTrace();
        }

        UserService userService = new UserServiceImpl();
        User newUser = userService.addUser(user);


        //4.操作成功与否验证
        if(newUser != null)
        {
            //添加成功,转发到mainMenu
            request.getRequestDispatcher(request.getContextPath()+"/jsp/mainMenu.jsp").forward(request,response);
        }
        else
        {
            //添加失败
            request.setAttribute("original",user);
            request.getRequestDispatcher(request.getContextPath()+"/jsp/createUser.jsp").forward(request,response);
        }

    }
}
