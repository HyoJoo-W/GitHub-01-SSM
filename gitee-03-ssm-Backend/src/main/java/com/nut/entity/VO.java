package com.nut.entity;

import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 20:30
 */
public class VO
{
    private List<User>userList;

    public List<User> getUserList()
    {
        return userList;
    }

    public void setUserList(List<User> userList)
    {
        this.userList = userList;
    }

    @Override
    public String toString()
    {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
