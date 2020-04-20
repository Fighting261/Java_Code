import java.util.Arrays;

/**
 * @program: 20200420
 * @description 顺序表
 * @author: Zhang Baolu
 * @create: 2020-04-20 14:42
 **/
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int Capacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[Capacity];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 判断顺序表是否满了
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    //检查位置是否合法
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos位置不合法!");
        }
    }

    // 在pos位置新增元素
    public void add(int pos, int data) {
        checkPos(pos);//检查插入位置是否合法

        //如果满了就扩大数组
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
            }

        for(int i = this.usedSize - 1; i >= pos  ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素  12
    public boolean contains(int toFind) {
        for(int i = 0;i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0;i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
            return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(this.usedSize ==0) {
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        if(pos < 0 || pos >= this.usedSize) {
            System.out.println("该pos无效");
        }
        return this.elem[pos];
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
        for(int i = search(toRemove) ; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

    //更新pos位置的元素   -19
    public void setPos(int pos, int value) {

        if(pos < 0 || pos >= this.usedSize){
            System.out.println("该“pos”无效");
        }
        this.elem[pos] = value;
    }
}
