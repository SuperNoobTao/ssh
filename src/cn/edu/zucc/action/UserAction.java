package cn.edu.zucc.action;

import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.model.UserBean;
import cn.edu.zucc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by shentao on 2016/5/3.
 */
public class UserAction extends ActionSupport {
    private UserService userService;
    private UserBean user = new UserBean();
    public UserAction(){}


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void setUser(UserBean user) {
        this.user = user;
    }

    public UserBean getUser() {
        return user;
    }


    public String login() throws Exception {
        System.out.println("username=" + this.getUser().getUsername());
        System.out.println("pwd=" + this.getUser().getPwd());

        if (userService.login(this.getUser().getUsername(), this.getUser().getPwd()) != null) {
            ActionContext.getContext().getSession().put("username",
                    this.getUser().getUsername());
            return "showuser";
        }
        return "error";
    }

    public String register() throws Exception {
        System.out.println("r_username=" + this.getUser().getUsername());
        System.out.println("r_pwd=" + this.getUser().getPwd());
        TbUserEntity user = new TbUserEntity();
        user.setUsername(this.getUser().getUsername());
        user.setPwd(this.getUser().getPwd());


        if (userService.add(user) == -1) {
            return "error1";
        }
            ActionContext.getContext().getSession().put("username", this.getUser().getUsername());
            return "showuser1";
        }
    public void abc(){
        this.userService.service();

    }

    }
