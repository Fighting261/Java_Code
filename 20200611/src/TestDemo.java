import java.util.*;

/**
 * @program: 20200611
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-11 10:57
 **/
public class TestDemo {

    //有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
    public int countWays(int x, int y) {
        // write code here
        if(x == 1 || y == 1) {
            return 1;
        }else {
            return countWays(x-1,y) + countWays(x,y - 1);
        }
    }


    //Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
    // 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求
    // 最少需要多少步可以变为Fibonacci数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int f1 = 0;
            int f2 = 1;
            int f3 = 0;
            while(f2 < N) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println((f2 - N) > (N - f1) ? (N - f1):(f2 - N));
        }
    }

    //有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
    // 求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，
    // 0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List list = new ArrayList();
            for(int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while(list.size() > 1){
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }


}
