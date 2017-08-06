import cn.gcc.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestHibernateLink {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @org.junit.Test
    public void test1(){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_name("傻逼");
        user.setUser_password("123");
        user.setUser_code("12312");
        user.setUser_state('1');
        session.save(user);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @org.junit.Test
    public void test2(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setUser_name("傻逼4");
        user.setUser_password("1223");
        user.setUser_code("121212");
        user.setUser_state('1');
        session.save(user);

        transaction.commit();
        session.close();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
