package cn.edu.zucc.dao;

/**
 * Created by shentao on 2016/5/3.
 */


import cn.edu.zucc.common.BaseDao;
import cn.edu.zucc.model.TbUserEntity;
import cn.edu.zucc.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * UserDao的实现类
 *
 */
public class UserDaoImpl extends BaseDao<TbUserEntity> implements  UserDao{
    @Override
    public TbUserEntity login(String username, String password) {
        try {
            Session session= HibernateUtil.getSession();
            return (TbUserEntity) session.createQuery("from TbUserEntity where username=:username and pwd=:pwd")
                    .setString("username", username)
                    .setString("pwd",password)
                    .uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    }



    @Override
    public boolean checkAcount(String username) {
        Session session= HibernateUtil.getSession();
        Query query = (Query) session.createQuery("from TbUserEntity where username=:username")
                .setString("username", username);
        TbUserEntity user = (TbUserEntity) query.uniqueResult();
        if(user != null){return true;}
        return false;
    }
}
