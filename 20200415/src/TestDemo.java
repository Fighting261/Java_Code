import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @program: 20200415
 * @description:HomeWork
 * @author: Zhang Baolu
 * @create: 2020-04-15 09:35
 **/
public class TestDemo {
    //在同一个类中,分别定义求两个整数和的方法和三个小数之和的方法。并执行代码，求出结果
    public static int sum(int x,int y) {
        return x + y;
    }
    public static double sum(double x,double y,double z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println("sum =" + sum(6, 4));
        System.out.println("sum =" + sum(3.14,6.28,0.9));
    }
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static int max(int x,int y){
        return x>y?x:y;
    }
    public static double max(double x,double y){
        return x>y?x:y;
    }
    public static double max(double x,double y,int z){
        return (x>y?x:y)>z?(x>y?x:y):z;
    }
    public static void main6(String[] args) {
        System.out.println("max=" + max(10, 20));
        System.out.println("max=" + max(1.2, 1.25));
        System.out.println("max=" + max(9.6, 7.5, 10));
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int x,int y) {
        return x>y?x:y;
    }
    public static int max3(int x,int y,int z) {
        return max2(x,y)>z?max2(x,y):z;
    }
    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("max=" + max2(a,b));
        System.out.println("max=" + max3(a, b, c));
    }

    //递归求解汉诺塔问题
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+ " ");
    }
    /*
    * n:盘子总数
    * pos1:起始地址
    * pos2:中间地址
    * pos3:目标地址
    * */
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main4(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }

    //青蛙跳台阶问题
    public static int jumpFrog(int n) {
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }for(int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(jumpFrog(num));
    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void myPrint(int n) {
        if(n > 9){
            myPrint(n /10);
        }
        System.out.print(n%10 + " ");
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        myPrint(num);//1234
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sum(int n) {
        if(n < 10) {
            return n;
        }
            return sum(n / 10)+ n % 10;
    }
    public static void main1(String[] args) {
        System.out.println("请输入一个非负整数");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(sum(num));
    }
}
