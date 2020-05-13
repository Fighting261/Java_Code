import java.util.ArrayList;
import java.util.List;

/**
 * @program: 20200513
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-13 21:47
 **/
public class TringleYH {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        //第0行
        if(numRows == 0) {
            return ret;
        }
        //第一行
        List<Integer> oneRow = new ArrayList<>();
        ret.add(oneRow);
        ret.get(0).add(1);
        //第二行开始
        for(int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow = ret.get(i-1);
            for(int j = 1; j < i; j++) {
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x+y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
        }
        return null;
    }
}
