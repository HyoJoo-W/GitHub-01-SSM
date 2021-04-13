package com.nut.web;

import com.nut.entity.Administrator;
import com.nut.service.AdministratorService;
import com.nut.service.impl.AdministratorServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 19:35
 * @ info : 管理员登录servlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //设置编码
        request.setCharacterEncoding("utf-8");

        //获取请求参数
        Map<String, String[]> parameterMap = request.getParameterMap();

        //封装Administrator，调用后台
        Administrator loginAdministrator =new Administrator();

        try
        {
            BeanUtils.populate(loginAdministrator,parameterMap);
        }
        catch (IllegalAccessException | InvocationTargetException e)
        {
            e.printStackTrace();
        }

        //调用service层
        AdministratorService administratorService = new AdministratorServiceImpl();
        Administrator administrator =
                administratorService.queryAdministrator(loginAdministrator);
        if(administrator != null)
        {
            //查询成功
            response.sendRedirect(request.getContextPath()+"/jsp/mainMenu.jsp");
        }
        else
        {
            //查询失败,反馈结果
            request.setAttribute("err_msg","用户名或密码错误!");
            request.setAttribute("original",loginAdministrator);
            request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
        }

    }
}
