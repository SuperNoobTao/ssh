package cn.edu.zucc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static Configuration configuration=null;
	private static ServiceRegistry registry=null;
	private static SessionFactory factory=null;
	private static ThreadLocal<Session> threadLocal=null;
	static {
		configuration=new Configuration().configure();
		registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		factory=configuration.buildSessionFactory(registry);
		threadLocal=new ThreadLocal<Session>();
	}
	public static Session getSession(){
		Session session=threadLocal.get();
		if(session==null){
			threadLocal.set(factory.openSession());
			session=threadLocal.get();
		}
		return session;
	}
	public static void closeSession(){
		Session session=threadLocal.get();
		if(session!=null){
			session.close();
			threadLocal.set(null);
		}
	}
}
