import java.util.Comparator;

/**
 * @program: 20200525
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-30 09:28
 **/
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}

