package com.study.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 19:55
 **/

//方式三
@Aspect
public class Diy2 {
    @Before("execution(* com.study.service.ServiceImpl.*(..))")
    public void before(){
        System.out.println("before++++");
    }
}
