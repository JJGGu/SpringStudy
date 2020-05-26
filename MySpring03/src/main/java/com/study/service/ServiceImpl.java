package com.study.service;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 17:07
 **/
public class ServiceImpl implements Service{
    public ServiceImpl() {
    }

    public void add() {
        System.out.println("method add");
    }

    public void delete() {
        System.out.println("method delete");
    }

    public void update() {
        System.out.println("method update");
    }

    public void select() {
        System.out.println("method select");
    }
}
