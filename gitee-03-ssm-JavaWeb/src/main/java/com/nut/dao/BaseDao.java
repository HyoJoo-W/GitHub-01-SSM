package com.nut.dao;

import com.nut.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-12 11:49
 */
public interface BaseDao
{
    public final JdbcTemplate jdbcTemplate =new JdbcTemplate(JDBCUtils.getDataSource());
}
