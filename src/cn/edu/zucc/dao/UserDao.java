package cn.edu.zucc.dao;

import cn.edu.zucc.model.TbUserEntity;

/**
 * Created by shentao on 2016/5/3.
 */

/**
 * UserDao类
 *
 */

public interface UserDao {
    public TbUserEntity login(String username, String password);
    public int add(TbUserEntity userEntity);
    public boolean checkAcount(String username);
}
