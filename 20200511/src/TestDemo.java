import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @program: 20200511
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-11 19:12
 **/

class Student{
    String name;
    String grade;
    double score;

    public Student(String name, String grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TestDemo {

    public static List<Character>func(String str1,String str2) {
    List<Character>list = new ArrayList<>();
    for(int i = 0;i < str1.length();i++) {
        if(!str2.contains(str1.charAt(i) + "")) {
            list.add(str1.charAt(i));
        }
    }
    return list;
    }

    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character>list = func(str1,str2);
        System.out.println(list);
    }

    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(7);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        Student student1 = new Student("张三","一年级",90.0);
        Student student2 = new Student("李四","二年级",95.0);
        Student student3 = new Student("王五","三年级",98.0);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
    }
}
