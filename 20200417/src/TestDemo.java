/**
 * @program: 20200417
 * @description:类和对象
 * @author: Zhang Baolu
 * @create: 2020-04-17 18:42
 **/
class Person{
    //字段->成员变量     定义在方法外边   类的里面
    //实例成员变量:对象里面
    public String name ;
    public int age;
    //静态成员变量  不属于对象   在方法区里
    public static int size;
    //方法->行为
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }public static void func1() {
        System.out.println("static::func()1");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        /*Person per = new Person();
        per.eat();
        per.sleep();*/
        Person.func1();
    }

    public static void main2(String[] args) {
        //实例化一个对象
        /*Person per = new Person();
        System.out.println(per.name);
        System.out.println(per.age);*/
        //如何让问静态的数据成员
        System.out.println(Person.size);
    }

    public static void main1(String[] args) {
        //实例化一个对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
    }

