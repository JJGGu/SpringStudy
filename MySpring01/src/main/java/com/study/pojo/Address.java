package com.study.pojo;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-25 23:05
 **/
public class Address {
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Address{" +
                "add='" + add + '\'' +
                '}';
    }

    public Address(String add) {
        this.add = add;
    }
}
