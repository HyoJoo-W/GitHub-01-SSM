package com.nut.service;

import com.nut.entity.User;

import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:39
 */
public interface UserService
{
    //添加User
    public User addUser(User user);

    //查询所有User
    public List<User> findAll();

    //根据name删除User
    public void deleteUserByName(String name);

    //根据name查询User
    User queryUserByName(String name);

    //修改User
    void updateUser(User user);
}
