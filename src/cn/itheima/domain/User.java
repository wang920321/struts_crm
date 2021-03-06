/**  

* Title: User.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月22日  

* @version 1.0  

*/
package cn.itheima.domain;

/**  

* Title: User  

* Description:   

* @author 172219902  

* @date 2018年3月22日  

*/
public class User {
	/*
	 * CREATE TABLE `sys_user` (
	  `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
	  `user_code` varchar(32) NOT NULL COMMENT '用户账号',
	  `user_name` varchar(64) NOT NULL COMMENT '用户名称',
	  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
	  `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
	  PRIMARY KEY (`user_id`)
	) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
	 */
	private Long user_id;
	private String user_code;
	private String user_name;
	private String user_password;
	private Character user_state;
	
	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_code
	 */
	public String getUser_code() {
		return user_code;
	}
	/**
	 * @param user_code the user_code to set
	 */
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return the user_state
	 */
	public Character getUser_state() {
		return user_state;
	}
	/**
	 * @param user_state the user_state to set
	 */
	public void setUser_state(Character user_state) {
		this.user_state = user_state;
	}
	

	/* (non-Javadoc)  
	
	 * Title: toString 
	
	 * Description:   
	
	 * @return  
	
	 * @see java.lang.Object#toString()  
	
	 */
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_code=" + user_code + ", user_name=" + user_name + ", user_password="
				+ user_password + ", user_state=" + user_state + "]";
	}
	
}
