package com.study;

import com.study.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 11:41
 **/

//@Configuration注解相当于applicationContext.xml配置文件
//@Bean注解相当于配置文件中的Bean标签
@Configuration
@ComponentScan("com.study")
public class MyConfig {
    //方法名相当于 id
    //返回类型相当于 class
    @Bean
    public Cat getCat(){
        return new Cat();
    }
}
