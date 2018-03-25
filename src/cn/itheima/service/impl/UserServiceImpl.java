/**  

* Title: UserServiceImpl.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.service.impl;



import cn.itheima.dao.UserDao;
import cn.itheima.dao.impl.UserDaoImpl;
import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.utils.HibernateUtils;

/**  

* Title: UserServiceImpl  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class UserServiceImpl implements UserService {

	private UserDao dao=new UserDaoImpl();
	@Override
	public User login(User user) {
		
		//打开事务
		HibernateUtils.getCurrentSession().beginTransaction();
		
		//调用Dao根据登录名称查询user对象
		User exisUser=dao.getByUserCode(user.getUser_code());
		//关闭事务
		HibernateUtils.getCurrentSession().getTransaction().commit();
		    //获得不到=>抛出异常提示用户名不存在
		if(exisUser==null){
			throw new RuntimeException("用户名不存在!");
		}
		//比对密码是否一致
		if(!exisUser.getUser_password().equals(user.getUser_password())){
			throw new RuntimeException("密码错误!");
		}
		    //不一致=>抛出异常提示密码错误
		//将数据库查询的User返回
		return exisUser;
	}

}
