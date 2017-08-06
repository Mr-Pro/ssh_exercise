package cn.gcc.dao.impl;

import cn.gcc.dao.UserDao;
import cn.gcc.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-06.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public void saveUser(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public User findUserById(Long user_id) {
        return getHibernateTemplate().get(User.class, user_id);
    }
}
