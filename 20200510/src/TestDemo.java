import java.util.*;

/**
 * @program: 20200510
 * @description:集合
 * @author: Zhang Baolu
 * @create: 2020-05-10 11:11
 **/
public class TestDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("智多星","吴用");
        map.put("小李广","花容");
        System.out.println(map.get("及时雨"));
        System.out.println(map.getOrDefault("行者", "武松"));
        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("鲁智深"));

        Set< Map.Entry<String,String> >  set = map.entrySet();
        for ( Map.Entry<String,String> entry : set ) {
            System.out.println(entry.getKey() + "=>" + entry.getValue() );
        }
    }

    public static void main2(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);
        //collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.remove("d"));
        System.out.println(collection);
        System.out.println(collection.size());

        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
    }
}