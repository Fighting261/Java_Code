/**
 * @program: 20200419
 * @description 类的封装和构造方法
 * this的用法：
 * this():调用自己的构造方法（只能在构造方法里用，且只能调用一次，放在第一行）
 * this.data:调用自己的属性
 * this.func():调用当前对象的方法
 * @author: Zhang Baolu
 * @create: 2020-04-19 11:54
 **/
class Person {
    private String name = "张三";
    private int age = 18;

    public Person() {
        this("曹操",18);
        System.out.println("Person<init>");
    }

    /*public Person(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(("Person<String,int>"));
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");

    }
}

public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        Person person2 = new Person("bit",19);
        System.out.println(person2);
    }
    public static void main3(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }


    public static void main2(String[] args) {
        Person person = new Person();
        person.setName("李四");
        person.setAge(20);
        person.show();
    }

    public static void main1(String[] args) {
        Person person = new Person();
        person.show();
    }
}
