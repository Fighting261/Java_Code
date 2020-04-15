/**
 * @program: 20200415
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-15 18:43
 **/
public class TestDemo2 {

    public static boolean isUp(int[] array){
        for(int i = 0; i < array.length; i++) {
            if(array[i] > array[i+ 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,10,5,6,};
        System.out.println(isUp(array));
    }

    //二分查找
    public static int binarySerach(int[] array,int key) {
        int left =0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(key > array[mid]){
                left = mid + 1;
            }else if(key < array[mid]) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] array = {2,5,8,9,13};
        System.out.println("下标是：" + binarySerach(array, 13));
    }

    public static int max(int[] array) {
        int max = 0;
        for(int i = 0;i < array.length; i++) {
            max = array[i]>max?array[i]:max;
        }
        return max;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("max=" + max(array));
    }

    public static int[] copyArray(int[] array){
        int[] arr =new int[array.length];
        for(int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        copyArray(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
