package cn.edu.zucc.service;

import cn.edu.zucc.model.TbUserEntity;

/**
 * Created by shentao on 2016/5/3.
 */
public interface UserService {

    public int add(TbUserEntity webUser);
    public TbUserEntity login(String username, String password);

    public void service();
}
