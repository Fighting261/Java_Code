import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: 20200525
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-30 11:26
 **/
class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class TopK {
    public static Integer[] topK(int[] array,int k) {
        MyComparator myComparator = new MyComparator();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);
        //匿名内部类
        /*PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });*/

        for(int i = 0; i < array.length; i++) {
            if(maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            }else {
                Integer val = maxHeap.peek();
                if(val != null && array[i] < val) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
            ret[i] = maxHeap.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,2,4,6,8};
        Integer[] ret = topK(array,5);
        System.out.println(Arrays.toString(ret));
    }

}
