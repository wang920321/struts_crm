/**  

* Title: UserDaoImpl.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;
import cn.itheima.utils.HibernateUtils;

/**  

* Title: UserDaoImpl  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class UserDaoImpl implements UserDao {

	
	@Override
	public User getByUserCode(String user_code) {
		//HQL查询
		//1获得session
		Session session = HibernateUtils.getCurrentSession();
		//2书写HQL
		String hql="from User where user_code=?";
		//3创建查询对象
		Query createQuery = session.createQuery(hql);
		//4设置参数
		createQuery.setParameter(0, user_code);
		//5执行查询
		User exisUser=(User) createQuery.uniqueResult();
		return exisUser;
	}

}
