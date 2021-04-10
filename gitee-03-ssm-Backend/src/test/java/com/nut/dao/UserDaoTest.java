package com.nut.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.nut.config.SpringConfiguration;
import com.nut.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-09 20:58
 */
public class UserDaoTest
{
    @Test
    public void testUserDao()
    {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //多个实例，用ID获取
        //UserService userService = (UserService)applicationContext.getBean("userService");
        // 单个实例，用字节码获取
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show();
    }

    @Test
    public void testAnnotation()
    {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.show();
    }

    @Test
    public void testDruid() throws Exception
    {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }    

    @Test
    public void testDataSource() throws Exception
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

        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
    
    @Test
    public void testSpringDataSource() throws Exception
    {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource bean = applicationContext.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();

    }

}