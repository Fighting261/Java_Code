import java.util.Arrays;
import java.util.Random;

/**
 * @program: 20200522
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-31 16:26
 **/
public class TestSort {

    //插入排序
    public static void insertSort(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-1; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    //希尔排序
    public static void shell(int[] array,int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i+=1) {
            tmp = array[i];
            int j;
            for (j = i-gap; j >= 0 ; j-=gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static  void  shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    //选择排序
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    //向下调整
    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //最起码有左孩子
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i>= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    //堆排序
    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        boolean flg = false;
        //i  表示趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                return;
            }
        }
    }

    //快速排序
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        //4 5 6  优化方式一：当待排序序列的数据个数小于等于100的时候，用直接插入排序。
        if(right-left+1 <= 100) {
            insert_sort(array,left,right);
            return;
        }

        three_num_mid(array,left,right);

        int par = partition(array, left, right);
        quick(array,left,par-1);
        quick(array,par+1,right);
    }

    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[right]
        int mid = (left+right)/2;
        if(array[left] > array[right]) {
            swap(array,left,right);
        }
        if(array[mid] > array[left]) {
            swap(array,left,mid);

        }
        if(array[mid] > array[right]) {
            swap(array,mid,right);
        }
    }

    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    public static void insert_sort(int[] array,int start,int end) {
        int tmp = 0;
        for (int i = start+1; i <= end; i++) {
            tmp = array[i];
            int j;
            for (j = i-1; j >= start ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    //归并排序
    public static void merge(int[] array,int low,int mid,int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] ret = new int[len];
        int i = 0;//用来表示ret数组的下标

        while (s1 <= mid && s2 <= high) {
            if(array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            }else {
                ret[i++] = array[s2++];
            }
        }

        while (s1 <= mid) {
            ret[i++] = array[s1++];
        }

        while (s2 <= high) {
            ret[i++] = array[s2++];
        }

        for (int j = 0; j < ret.length; j++) {
            array[j+low] = ret[j];
        }

    }

    public static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        //分解
        int mid = (low+high)>>>1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

}

