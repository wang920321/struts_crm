/**  

* Title: LoginInterceptor.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月25日  

* @version 1.0  

*/
package cn.itheima.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{
    //指定不拦截登录方法，除登录外其他方法都要拦截
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//1获得session
		Map<String, Object> session = ActionContext.getContext().getSession();
		//2获得登录标识
		Object object = session.get("user");
		//3判断登录标识是否存在
		if(object==null){
			//不存在=>没登录=>重定向到登录页面
			return "toLogin";
		}else{
			//存在=>已经登录=>放行
			return invocation.invoke();
		}
		    
		    
		
		
	}
    
}
