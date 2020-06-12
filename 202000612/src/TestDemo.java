import java.util.Scanner;

/**
 * @program: 202000612
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-12 15:17
 **/
public class TestDemo {

    //输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i = n; i > 4; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                num++;
                tmp /= 5;
            }
        }
        System.out.println(num);
    }

    //输入一个整数，将这个整数以字符串的形式逆序输出
    //程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
    public static void main2(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        while(num != 0) {
            int s1 = num%10;
            int s2 = num/10;
            str += String.valueOf(s1);
            num = s2;
        }
        System.out.println(str);
    }
}



