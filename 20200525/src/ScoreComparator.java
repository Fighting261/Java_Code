import java.util.Comparator;

/**
 * @program: 20200525
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-30 09:31
 **/
public  class ScoreComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}
