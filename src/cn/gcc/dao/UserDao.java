package cn.gcc.dao;

import cn.gcc.domain.User;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-06.
 */
public interface UserDao {

    void saveUser(User user);

    User findUserById(Long user_id);
}
