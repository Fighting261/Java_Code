import java.util.*;

/**
 * @program: 20200531
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-01 11:43
 **/
public class TestDemo {

    //10_0000个数据中找出第一个重复的
    public static void main1(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10_0000; i++) {
          list.add(random.nextInt(5000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list) {
            if(set.contains(val)) {
                System.out.println(val);
                return;
            }else {
                set.add(val);
            }
        }
    }

    //10_0000个数据中去重复的数据
    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(5000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list) {
                set.add(val);
            }
        System.out.println(set);
    }

    //10_0000个数据，统计重复数字出现的概率
    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(5000));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer key:list) {
            if(map.get(key) == null) {
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "出现次数为" + entry.getValue());
        }
    }

    // 只出现一次的数字
    public static void main4(String[] args) {
        int[] array = {1,1,0};
        HashSet set = new HashSet();
        for (int val:array) {
            if(set.contains(val)) {
                set.remove(val);
            }else {
                set.add(val);
            }
        }
        System.out.println(set);
    }

    //坏键盘打字
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();//7_This_is_a_test
        String actual = scanner.nextLine();//_hs_s_a_es

        //1、把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        HashSet<Character> setBroken = new HashSet<>();
        for (char ex :expected.toUpperCase().toCharArray()) {
            if(!setActual.contains(ex) && !setBroken.contains(ex)) {
                System.out.print(ex);
                setBroken.add(ex);
            }
        }
    }
}
