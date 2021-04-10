package com.nut.entity;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ResourceBundle;


/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 22:38
 */
public class AccountTest
{
    @Test
    public void testAccount()
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("druid");
        String driver = resourceBundle.getString("jdbc.driver");
        String url = resourceBundle.getString("jdbc.url");
        String username = resourceBundle.getString("jdbc.username");
        String password = resourceBundle.getString("jdbc.password");

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        //设置数据源对象
        jdbcTemplate.setDataSource(druidDataSource);

        //执行操作
        jdbcTemplate.update("insert into account values(?,?)","tom",5000);

    }
    
    @Test
    public void testXML()
    {
        ApplicationContext  applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = applicationContext.getBean(JdbcTemplate.class);
        bean.update("insert into account values(?,?)","amy",1000);
    }    

}