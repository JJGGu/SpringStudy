package com.study.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-25 21:10
 **/
public class UserTest {

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getBean参数为配置文件中的类id，而不pojo中本身的类名
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());

    }
}
