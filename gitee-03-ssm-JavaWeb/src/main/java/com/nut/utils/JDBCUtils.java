package com.nut.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-11 19:15
 */
public class JDBCUtils
{
    private static DataSource dataSource;

    static
    {
        //加载配置文件
        Properties properties = new Properties();

        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream resourceAsStream = JDBCUtils.class.getClassLoader().getResourceAsStream("druid2.properties");
        try
        {
            properties.load(resourceAsStream);

            //初始化连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //获取连接池资源
    public static DataSource getDataSource()
    {
        return dataSource;
    }

    //获取数据库连接
    public static Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();
    }
}
