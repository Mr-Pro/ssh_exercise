package cn.gcc.service.impl;

import cn.gcc.dao.UserDao;
import cn.gcc.domain.User;
import cn.gcc.service.UserService;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-03.
 */
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void login(User user) {
        System.out.println("success");
    }

    @Override
    public void saveUser(User user) {
        System.out.println("保存用户");
        userDao.saveUser(user);
    }


}
