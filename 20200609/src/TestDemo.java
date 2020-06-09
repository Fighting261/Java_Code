import java.util.Scanner;

/**
 * @program: 20200609
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-09 08:57
 **/
public class TestDemo {
    /*链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
    小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
    可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。

    输入描述:
    输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
    输出描述:
    输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1*/
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    public static int count(int n) {
        if (n < 6 || ((n % 2) != 0)) {
            return -1;
        }
        if (n % 8 == 0) {
            return n / 8;
        }
        return n / 8 + 1;
    }

/*    有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。John现在有n个想要得到的物品，每
    个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，如果选出的物体的总体积是40，那么利用这个神奇的口袋，John
    就可以得到这些物品。现在的问题是，John有多少种不同的选择物品 的方式。

    输入描述:
    输入的第一行是正整数n (1 <= n <= 20)，表示不同的物品的数目。接下来的n行，每行有一个1到40之间的正整数，分别给出a1，a2……an的值。
    输出描述:
    输出不同的选择物品的方式的数目。
    */

    static int[] weight;
    static int N;
    static int count = 0;

    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }
            count(40, N);
            System.out.println(count);
        }
    }

    public static void count(int s, int n) {
        //如果正好装满
        if (s == 0) {
            ++count;
            return;
        }
        //是s<0或n<1则不能完成
        if (s < 0 || (s > 0 && n < 1))
            return;
        count(s - weight[n], n - 1);
        count(s, n - 1);
    }
/*  输入n个整数，输出出现次数大于等于数组长度一半的数。

    输入描述:
    每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
    输出描述:
    输出出现次数大于等于n/2的数。*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int num = arr[0];
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                } else if (count > 0) {
                    count--;
                } else {
                    num = arr[j];
                }
            }
            System.out.println(num);
        }
    }
}


