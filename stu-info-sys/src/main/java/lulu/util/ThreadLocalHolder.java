package lulu.util;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/10 18:11
 * @ Author：Mr Zhang
 */
public class ThreadLocalHolder {
    private static ThreadLocal<Integer> TOTAL = new ThreadLocal<>();

    public static ThreadLocal<Integer> getTOTAL() {
        return TOTAL;
    }

}
