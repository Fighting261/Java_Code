package com.bit.demo1;

/**
 * @program: 20200428
 * @description:多态
 * @author: Zhang Baolu
 * @create: 2020-04-28 17:05
 **/
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}

class Cat extends Animal {
    public int count = 99;
    public Cat(String name) {
        super(name);//显示调用父类的构造方法
        System.out.println("Cat(String)");
    }

    public void eat() {
        System.out.println(this.name + "重写猫Animal::eat()");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }//显示调用父类的构造方法
    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }
}

public class TestMain {

    /*
    * 多态
    *
    * 运行时绑定：
    * 父类引用子类对象  ，同时  通过父类引用调用同名的覆盖方法
    * 此时就会发生运行时绑定
    * */
    public static void main(String[] args) {
        Animal animal = new Cat("mimi");
        animal.eat();
    }

    public static void main2(String[] args) {
        //向上转型  ->>  父类引用子类对象
        Animal animal = new Cat("mimi");
        animal.eat();
        //animal.count; error  向上转型之后,通过父类的引用，只能访问自己的方法或者属性
    }
    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("mimi");
    }
}
