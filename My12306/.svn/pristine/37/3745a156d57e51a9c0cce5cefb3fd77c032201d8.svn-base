package com.qf.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TUser;
import com.qf.service.iservice.ITUserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;


@Controller("userAction")
@Scope("prototype")
public class UserAction implements RequestAware, SessionAware, ModelDriven<TUser> {
	
	//取值
	TUser user = new TUser();
	Map<String, Object> requestMap;
	
	@Override
	public TUser getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	Map<String, Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	
private String type1;
	
	//2处理业务逻辑，注入Service层对象
	@Autowired
	@Qualifier("userService")
	private ITUserService userService;
	
	public UserAction() {
	}
	public String getType() {
		return type1;
	}
	public void setType(String type) {
		this.type1 = type;
	}
	
	public String save(){
		System.out.println("*****************"+mail+"*****************");
		user.setUrole("普通用户");
		try {
			return userService.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	//登陆
		public String login(){
		
			String msg = "loginerror";
			TUser login2 = userService.findByLogin(user);
			if(login2 != null){
				msg = "success";
				sessionMap.put("TUser", login2);
			}
			return msg;
		}
	

	

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}
	
	private String mail;

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
