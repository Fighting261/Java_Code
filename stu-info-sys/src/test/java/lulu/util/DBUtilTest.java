package lulu.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/7/28 21:17
 * @ Author：Mr Zhang
 */
public class DBUtilTest {
    @Test
    public void testConnection(){
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
