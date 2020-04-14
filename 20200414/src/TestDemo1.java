/**
 * @program: 20200414
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-14 11:16
 **/
public class TestDemo1 {
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] arrayCreat(int[] array) {
        int j = 0;
        for(int i = 0;i < 100;i++){
            j++;
            array[i] = j;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int [100];
        arrayCreat(array);
        for(int i = 0; i < 100; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main4(String[] args) {
    int[] array ={1,2,3,4,5,6,7,8,9,10};
        printArray(array);
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transForm(int[] array1,int[] array2) {
        for(int i = 0;i < array1.length; i++) {
            array2[i] = array1[i] * 2;
        }
    }
    public static void main3(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {0,0,0};
        transForm(array1,array2);
        for(int i = 0;i < array1.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    // 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(array));
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值
    public static double avg(int[] array) {
        double avg = 0;
        double sum = 0;
        for(int i = 0;i < array.length; i++){
             sum += array[i];
        }
        return avg = (double)(sum/array.length);
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(avg(array));
    }
}
