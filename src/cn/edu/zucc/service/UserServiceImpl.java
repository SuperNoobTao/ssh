package cn.edu.zucc.service;

import cn.edu.zucc.dao.UserDao;
import cn.edu.zucc.dao.UserDaoImpl;
import cn.edu.zucc.model.TbUserEntity;

/**
 * Created by shentao on 2016/5/3.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public int add(TbUserEntity user) {
        if(userDao.checkAcount(user.getUsername()) == false){

        return userDao.add(user);
       }
        return -1;

    }

    @Override
    public TbUserEntity login(String username, String password) {
        return userDao.login(username,password);
    }

      public void service(){
        System.out.println("MyService");
    }
}
