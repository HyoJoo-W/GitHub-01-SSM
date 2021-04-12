package com.nut.service.impl;

import com.nut.dao.UserDao;
import com.nut.dao.impl.UserDaoImpl;
import com.nut.entity.User;
import com.nut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:39
 */

public class UserServiceImpl implements UserService
{
    private final UserDao userDao = new UserDaoImpl();

    //查询所有User服务
    @Override
    public List<User> findAll()
    {
        return userDao.findAll();
    }

    @Override
    public User addUser(User user)
    {
        return userDao.addUser(user);
    }

    //根据name删除User
    @Override
    public void deleteUserByName(String name)
    {
        userDao.deleteUserByName(name);
    }

    //根据name查询User
    @Override
    public User queryUserByName(String name)
    {
        return userDao.queryUserByName(name);
    }

    //修改User
    @Override
    public void updateUser(User user)
    {
        userDao.updateUser(user);
    }
}
