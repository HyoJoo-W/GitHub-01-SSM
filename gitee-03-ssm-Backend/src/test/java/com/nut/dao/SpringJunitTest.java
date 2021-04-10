package com.nut.dao;

import com.nut.config.SpringConfiguration;
import com.nut.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 15:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringConfiguration.class})
//@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest
{
    @Autowired
    private UserService userService;

    @Test
    public void testUserService()
    {
        userService.show();
    }

}
