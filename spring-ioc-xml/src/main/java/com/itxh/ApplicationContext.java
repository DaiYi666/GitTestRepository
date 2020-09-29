package com.itxh;

import com.itxh.pojo.DataSourceProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSourceProperties dataSourceProperties = context.getBean(DataSourceProperties.class);
        System.out.println(dataSourceProperties);
        context.close();

        /*这是一些注释*/
    }
}
