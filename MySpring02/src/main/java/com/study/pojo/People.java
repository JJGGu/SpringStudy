package com.study.pojo;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 09:34
 **/
public class People {
    private Cat cat;
    private Dog dog;

    public People() {
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void bark(){
        cat.bark();
        dog.bark();
    }
}
