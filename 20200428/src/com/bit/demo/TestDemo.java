package com.bit.demo;

/**
 * @program: 20200428
 * @description: 继承
 * @author: Zhang Baolu
 * @create: 2020-04-28 16:46
 **/
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        System.out.println("Cat(String)");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
    }
}

