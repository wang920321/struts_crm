/**  

* Title: UserAction.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.service.impl.UserServiceImpl;

/**  

* Title: UserAction  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user=new User();
    private UserService service=new UserServiceImpl();
	@Override
	public User getModel() {
		
		return user;
	}

	public String login() throws Exception {
		//调用service执行操作
		User user1=service.login(user);
		//将返回的user对象放入session域作为登录标识
		ActionContext.getContext().getSession().put("user", user1);
		//重定向到项目的首页
		return "toHome";
	}
    
}
