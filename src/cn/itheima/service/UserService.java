/**  

* Title: UserService.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.service;

import cn.itheima.domain.User;

/**  

* Title: UserService  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public interface UserService {

	/**  
	
	 * Title: login  
	
	 * Description:  
	
	 * @param user
	 * @return  
	
	 */ 
	User login(User user);

}
