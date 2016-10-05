package dao;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lenovo on 2016/10/01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest extends TestCase {

    @Autowired
    @Qualifier("userProxyBean")
    private UserDao dao;

    @Test
    public void testAdd() throws Exception {
        dao.add();
        dao.update();
        dao.delete();
    }

    public void testUpdate() throws Exception {

    }

    public void testDelete() throws Exception {

    }

}