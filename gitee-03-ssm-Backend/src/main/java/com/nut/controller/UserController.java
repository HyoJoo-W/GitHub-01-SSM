package com.nut.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nut.entity.User;
import com.nut.entity.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 16:45
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/quick")
    public String show()
    {
        System.out.println("controller is running...");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView show2()
    {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("username","root");
        modelAndView.setViewName("success");

        return modelAndView;
    }
    @RequestMapping("/quick3")
    public ModelAndView show3(ModelAndView modelAndView)
    {
        modelAndView.addObject("username","root2");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String show4(Model model)
    {
        model.addAttribute("username","root3");
        return "success";
    }

    //使用Web基础阶段的request域
    @RequestMapping("/quick5")
    public String show5(HttpServletRequest request)
    {
        request.setAttribute("username","root4");
        return "success";
    }

    //使用Web基础阶段
    @RequestMapping("/quick6")
    public void show6(HttpServletResponse response) throws IOException
    {
        response.getWriter().print("hello !");
    }


    @RequestMapping("/quick7")
    @ResponseBody //告知SpringMVC框架不进行视图跳转， 直接进行数据响应
    public String show7()
    {
        return "hello!";
    }

    //返回JSON格式数据
    @RequestMapping("/quick8")
    @ResponseBody
    public String show8()
    {
        return "{\"username\":\"nut\",\"age\":18}";
    }

    //使用Jackson工具
    @RequestMapping("/quick9")
    @ResponseBody
    public String show9() throws JsonProcessingException
    {
        User user = new User();
        user.setName("nut");
        user.setAge(18);

        //使用Jackson工具
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(user);

    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User show10()
    {
        User user = new User();
        user.setName("nut");
        user.setAge(18);

        return user;
    }


    //获取一般类型参数
    @RequestMapping("/quick11")
    @ResponseBody
    public void show11(String name,int age)
    {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    //获取POJO类型参数
    @RequestMapping("/quick12")
    @ResponseBody
    public void show12(User user)
    {
        System.out.println(user);
    }

    //获取集合
    @RequestMapping("/quick13")
    @ResponseBody
    public void show13(VO vo)
    {
        System.out.println(vo);
    }

    //获取集合
    @RequestMapping("/quick14")
    @ResponseBody
    public void show14(@RequestBody List<User>userList)
    {
        System.out.println(userList);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void show15(@RequestParam(value = "username",required = false,defaultValue = "defaultName")String name)
    {
        System.out.println("name = " + name);
    }

    @RequestMapping("/quick16/{name}")
    @ResponseBody
    public void show16(@PathVariable(value = "name")String name)
    {
        System.out.println("name = " + name);
    }

    @RequestMapping("/quick17")
    @ResponseBody
    public void show17(Date date)
    {
        System.out.println("date = " + date);
    }

    @RequestMapping("/quick18")
    @ResponseBody
    public void show18(String name, MultipartFile uploadFile) throws IOException
    {
        uploadFile.transferTo(new File("C:\\Users\\35854\\Desktop\\test\\"+ uploadFile.getOriginalFilename()));
    }

}
