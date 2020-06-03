import java.util.Scanner;

/**
 * @program: 20200602
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-02 20:29
 **/
public class TestDemo {
    /*
*链接：https://www.nowcoder.com/questionTerminal/bb06495cc0154e90bbb18911fd581df6
* 有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。请设计一个高效的算法，
* 计算给定数组中的逆序对个数。给定一个int数组A和它的大小n，请返回A中的逆序对个数。保证n小于等于5000。
* 测试样例：
[1,2,3,4,5,6,7,0],8
返回：7
   * */
    public class AntiOrder {
        public int count(int[] A, int n) {
            // write code here
            int count = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    if(A[i] > A[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

/*    链接：https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
    有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
    答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时
    候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上
    有n个空汽水瓶，最多可以换多少瓶汽水喝？*/

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n != 0) {
                System.out.println(n/2);
            }
        }
    }
}

