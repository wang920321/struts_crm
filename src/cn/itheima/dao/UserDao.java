/**  

* Title: UserDao.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.dao;

import cn.itheima.domain.User;

/**  

* Title: UserDao  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public interface UserDao {

	/**  
	
	 * Title: getByUserCode  
	
	 * Description:  
	
	 * @param user_code
	 * @return  
	
	 */ 
	User getByUserCode(String user_code);

}
