package cn.gcc.action;

import cn.gcc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-02.
 */
public class UserAction extends ActionSupport {

    private UserService userService;

    public String hello(){
        System.out.println(userService);
        return SUCCESS;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
