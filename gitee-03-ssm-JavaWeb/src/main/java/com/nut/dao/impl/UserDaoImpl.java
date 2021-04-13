package com.nut.dao.impl;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.nut.dao.UserDao;
import com.nut.entity.User;
import com.nut.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 13:39
 */
public class UserDaoImpl implements UserDao
{
    private final JdbcTemplate jdbcTemplate =new JdbcTemplate(JDBCUtils.getDataSource());

    //添加User
    @Override
    public User addUser(User user)
    {
        String sql = "insert into user(name,password,gender,date,money) values(?,?,?,?,?)";
        try
        {
            int effectedLines = jdbcTemplate.update(sql,
                    user.getName(),
                    user.getPassword(),
                    user.getGender(),
                    user.getDate(),
                    user.getMoney());
            return effectedLines > 0 ? user : null;
        }
        catch (DataAccessException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    //查询所有User
    @Override
    public List<User> findAll()
    {
        String sql = "select * from user";

        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }

    //根据name查询User
    @Override
    public User queryUserByName(String name)
    {
        String sql = "select * from user where name = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),name);
    }

    //修改User
    @Override
    public void updateUser(User user)
    {
        String sql = "update user set password= ? , gender = ? ,date = ? where name = ?";
        jdbcTemplate.update(sql,
                user.getPassword(),
                user.getGender(),
                user.getDate(),
                user.getName());
    }

    //根据name删除User
    @Override
    public void deleteUserByName(String name)
    {
        String sql = "delete from user where name = ?";

        jdbcTemplate.update(sql,name);
    }
}
