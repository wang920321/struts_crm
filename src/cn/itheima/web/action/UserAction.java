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

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.User;
import cn.itheima.service.CustomerService;
import cn.itheima.service.UserService;
import cn.itheima.service.impl.CustomerServiceImpl;
import cn.itheima.service.impl.UserServiceImpl;

/**  

* Title: UserAction  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user=new User();
    
	@Override
	public User getModel() {
		
		return user;
	}

	public String login() throws Exception {
		  //获得spring容器=>从Application域获得即可
				ServletContext sc=ServletActionContext.getServletContext();
				//从sc中获得ac容器
				WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
				//从容器中获得customerService
				UserService us = (UserService) ac.getBean("userService");
		//-----------------------------------------
		//调用service执行操作
		User user1=us.login(user);
		//将返回的user对象放入session域作为登录标识
		ActionContext.getContext().getSession().put("user", user1);
		//重定向到项目的首页
		return "toHome";
	}
    
}
