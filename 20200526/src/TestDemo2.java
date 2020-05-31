/**
 * @program: 20200526
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-31 15:13
 **/
class Generic<T extends Comparable<T>>  {
    public T maxNum(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

/**
 * 类型推导-》根据实参的类型推导出形参的类型
 */
class Generic2 {

    public static <T extends Comparable<T>> T maxNum(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
public class TestDemo2 {

    public static void main(String[] args) {
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(Generic2.maxNum(array));

        String[] strings = {"abc","hello","bit"};
        System.out.println(Generic2.maxNum(strings));

    }

    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(generic.maxNum(array));

        Generic<String> generic2 = new Generic<>();
        String[] strings = {"abc","hello","bit"};
        System.out.println(generic2.maxNum(strings));
    }
}
