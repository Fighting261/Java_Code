import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 20200610
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-10 15:56
 **/
public class TestDemo {

    //找出n个数里最小的k个
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                String str = sc.nextLine();
                String[] s = str.split(" ");
                int[] arr = new int[s.length-1];
                int k = 0;
                for(int j = 0; j < s.length; j++) {
                    if(j < arr.length){
                        arr[j]=Integer.valueOf(s[j]);
                    }else{
                        k=Integer.valueOf(s[j]);
                    }
                }
                Arrays.sort(arr);
                for(int i = 0; i < k; i++) {
                    if(i < k-1){
                        System.out.print(arr[i] + " ");
                    }else {
                        System.out.print(arr[i]);
                    }

                }
            }
        }
        
     //输入一个整数，将这个整数以字符串的形式逆序输出
    //程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
     public static void main2(String[] args) {
         Scanner sc = new Scanner(System.in);
         while(sc.hasNext()) {
             String str = sc.nextLine();
             StringBuffer strb = new StringBuffer(str);
             strb.reverse();
             System.out.println(strb.toString());
         }
     }

}
