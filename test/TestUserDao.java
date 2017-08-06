import cn.gcc.dao.UserDao;
import cn.gcc.domain.User;
import cn.gcc.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserDao {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Resource(name = "userService")
    private UserService userService;

    @org.junit.Test
    public void test1(){
        User user = userDao.findUserById(1L);
        System.out.println(user);
    }

    @org.junit.Test
    public void test2(){
        User user = new User();
        user.setUser_name("傻逼5");
        user.setUser_password("12322");
        user.setUser_code("1222");
        user.setUser_state('1');
        userDao.saveUser(user);
    }

    @org.junit.Test
    public void test3(){
        User user = new User();
        user.setUser_name("哈哈");
        user.setUser_password("12");
        user.setUser_code("122");
        user.setUser_state('1');

        userService.saveUser(user);
    }
}
