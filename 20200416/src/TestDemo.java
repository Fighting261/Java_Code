import java.util.Arrays;

/**
 * @program: 20200416
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-16 11:42
 **/

public class TestDemo {
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]",
    // 注意 逗号 的位置和数量.
    public static String mytoString (int[] array) {
        String ret = "[";
        for(int i = 0; i < array.length; i++) {
            if(i < array.length-1) {
                ret += array[i] + ",";
            }else {
                ret += array[i];
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(mytoString(array));
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyArray(int[] array1,int[] array2) {
        for(int i = 0; i <array1.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }
    public static void main6(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        System.out.println(Arrays.toString(copyArray(array1,array2)));
    }
    //给定一个有序整型数组, 实现二分查找
    public static int subSort(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key < array[mid]) {
                right = mid - 1;
            } else if (key > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("找到了，下标是：" + subSort(array, 8));
    }
    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean order(int[] array) {
        for(int i = 0; i < array.length- 1; i++) {
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main4(String[] args) {
        int[] array = {1,3,5,6,7};
        System.out.println(order(array));
    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for(int j = 0; j <array.length - i - 1;j++ ) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }if(flag) {
                break;
            }
        }
    }
    public static void main3(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static void mySort(int[] array) {
        int left = 0;
        int right = array.length-1;
        for(int i = 0; i < array.length; i++) {
            if(left < right && array[left] % 2 != 0){
                left++;
            }else if(left < right && array[right] % 2 == 0) {
                right--;
            }if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main2(String[] args) {
        int[] array = {2,3,6,8,9};
        mySort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int different(int array[]) {
        int ret= 0;
        for(int i = 0;i < array.length; i++) {
            ret ^= array[i];
        }
        return ret ^ 0;
    }
    public static void main1(String[] args) {
    int[] array = {1,2,3,4,3,2,1};
        System.out.println("找到了，是：" + different(array));
    }
}
