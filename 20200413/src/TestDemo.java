import java.util.Arrays;

/**
 * @program: 20200413
 * @description:数组
 * @author: Zhang Baolu
 * @create: 2020-04-13 18:44
 **/
public class TestDemo {
    public static String myToString(int[] array) {
        int i = 0;
        String ret = "[";
        for( i = 0;i < array.length; i++){
            ret += array[i];
        if(i != array.length - 1){
            ret += ",";
        }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(myToString(array));
    }

    public static void main5(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    public static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main3(String[] args) {
        int [] array = {1,2,3,4};
        //printArray(array);
        int[] array2 = {10,20};
        System.out.println(array2[0]+" "+array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+array2[1]);

    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);
        for(int i = 0;i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
            System.out.println();
            for(int val : array){
                System.out.print(val + " ");
        }
    }




    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[]{11,22,33,44};//new: 实例化一个对象
        int[] array3 = new int[4];//栈上的地址拿不到，堆上的地址可以拿到，但不是真实的
        System.out.println(array);
    }
}
