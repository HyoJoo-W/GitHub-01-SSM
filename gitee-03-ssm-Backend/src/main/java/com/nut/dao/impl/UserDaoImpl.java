package com.nut.dao.impl;

import com.nut.dao.UserDao;
import com.nut.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-09 20:52
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao
{
    private Map<String,User>userMap;

    public void setUserMap(Map<String, User> userMap)
    {
        this.userMap = userMap;
    }

    @Override
    public void show()
    {
        System.out.println("spring is running");
        //System.out.println(userMap);
    }
}
