import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: 20200515
 * @description:用两个队列实现栈
 * @author: Zhang Baolu
 * @create: 2020-05-15 11:06
 **/
public class MyStackQ {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */

    public MyStackQ() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push (int x) {
        if(!queue1.isEmpty()){
            queue1.offer(x);
        }else if(!queue2.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }

    public int pop() {
        if(empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        int data = 0;
        if(!queue1.isEmpty()) {
            for (int i = 0; i < qSize1; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }else {
            for (int i = 0; i < qSize2; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }

    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}
