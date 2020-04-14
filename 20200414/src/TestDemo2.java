import java.util.Scanner;

/**
 * @program: 20200414
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-14 20:48
 **/
public class TestDemo2 {
    
    //求 N 的阶乘
    public static int factorial2(int n) {
        int sum = 0;
        int ret = 1;
        for(int i = 1;i < n;i++){
            ret = n*i;
        }
        return ret;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
    //递归求 N 的阶乘
    public static int factorial(int n) {
        int ret = 0;
        if(n < 2){
            return 1;
        }else{
            ret = n*factorial (n-1);
        }
        return ret;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3; i <= n; i++) {
            f3 = f1 +f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
    }

    //求斐波那契数列的第n项。(递归实现)
    public static int fib(int n) {
        int ret =0;
        if(n < 3){
            return 1;
        }else {
            ret = fib(n-1)+fib(n-2);
        }
           return ret ;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
    }
}
