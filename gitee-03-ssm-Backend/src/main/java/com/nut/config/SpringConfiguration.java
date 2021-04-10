package com.nut.config;

import org.springframework.context.annotation.*;


/**
 * @ author : HyoJoo-W
 * @ createDate : 2021-04-10 14:52
 */

@Configuration //配置文件注解
@ComponentScan("com.nut") //组件注解扫描
@Import({DruidDataSourceConfiguration.class}) //导入配置文件
public class SpringConfiguration
{

}
