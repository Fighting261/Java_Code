/**
 * @program: 20200419
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-19 15:58
 **/
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    public void add(int pos,int data) {
        if(pos >= 0 && pos <= usedSize ) {
            for(int i = this.usedSize -1; i >= pos; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    public void display() {
        for(int i = 0;i < this.usedSize;i++) {
            System.out.print(this.elem[i]);
        }
    }
    public boolean contains(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
           if(elem[i] == toFind){
               break;
           }
        }
        return true;
    }

    public int search(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public int getPos(int pos) {
        if(usedSize == 0 || pos < 0 || pos > usedSize) {
            return -1;
        }
        return this.elem[pos];
    }

    public void remove(int toRemove) {
        int index = search(toRemove);
        for(int i = index; i < usedSize-1; i++){
            this.elem[i] = this.elem[i+1];
        }
        usedSize--;
    }
}

