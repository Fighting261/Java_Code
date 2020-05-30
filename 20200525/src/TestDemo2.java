import java.util.Arrays;

/**
 * @program: 20200525
 * @description: Comparable接口实现类的比较
 * 缺点：每次业务不同  需要去修改类本身。
 * @author: Zhang Baolu
 * @create: 2020-05-30 09:13
 **/
class Student implements Comparable<Student>{
    public int age;
    public int score;
    public String name;

    public Student(String name,int age,int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;    //从小到大
        //return this.score - o.score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}

public class TestDemo2 {

    public static void main(String[] args) {
        Student student1 = new Student("bit",16,89);
        Student student2 = new Student("gaobo",26,66);
        Student student3 = new Student("caocao",6,96);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }

    /*public static void main(String[] args) {
        Student student1 = new Student("bit",16,89);
        Student student2 = new Student("gaobo",26,66);
        if(student1.compareTo(student2) > 0) {
            System.out.println("student1大于stu2");
        }
    }*/
}