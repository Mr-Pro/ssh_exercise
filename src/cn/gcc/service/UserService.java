package cn.gcc.service;

import cn.gcc.domain.User;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-03.
 */
public interface UserService {
    void login(User user);

    void saveUser(User user);
}
