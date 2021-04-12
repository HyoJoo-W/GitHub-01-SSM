package com.nut.dao.impl;

import com.nut.dao.AdministratorDao;
import com.nut.dao.BaseDao;
import com.nut.entity.Administrator;
import com.nut.entity.User;
import com.nut.utils.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-12 11:45
 */
public class AdministratorDaoImpl implements BaseDao,AdministratorDao
{
    //查询Administrator
    @Override
    public Administrator queryAdministrator(Administrator administrator)
    {
        String sql = "select * from administrator where name = ? and password = ?";
        try
        {
            Administrator admin = jdbcTemplate.queryForObject(sql,
                    new BeanPropertyRowMapper<>(Administrator.class),
                    administrator.getName(),
                    administrator.getPassword());
            return admin;

        }
        catch (DataAccessException e)
        {
            //e.printStackTrace();
            return null;
        }
    }
}
