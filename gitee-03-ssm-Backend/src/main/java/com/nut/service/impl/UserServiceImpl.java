package com.nut.service.impl;

import com.nut.dao.UserDao;
import com.nut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-09 21:22
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired   //根据类型从Spring容器中匹配
    @Qualifier("userDao")  //根据id名称从Spring容器中匹配，与Autowired一起使用
    //@Resource(name = "userDao")
    private  UserDao userDao;

    @Value("${jdbc.driver}")
    private String name;



    public UserServiceImpl(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    @Override
    public void show()
    {
        //System.out.println(name);
        userDao.show();
    }
    @PostConstruct
    public void init()
    {
        //System.out.println("service的初始化方法");
    }

    @PreDestroy
    public void destroy()
    {
        //System.out.println("service的销毁方法");
    }
}
