package com.nut.dao;

import com.nut.entity.User;

import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:34
 */

public interface UserDao
{
    //添加User
    public User addUser(User user);

    //查询所有User
    public List<User> findAll();

    //根据name查询User
    User queryUserByName(String name);

    //修改User
    public void updateUser(User user);

    //根据name删除User
    void deleteUserByName(String name);


}
