package com.java.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Users {
	private String uid;			//用户id
	private String uname;		//用户名
	private String upwd;		//用户密码
	private String realname;	//真实姓名
	private String sex;			//用户性别
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;		//用户出生年月日
	private String tel;			//用户手机号
	private String email;		//用户邮箱
	private String emailcode;	//用户邮箱激活码
	private int status;		//用户状态
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatetime;	//用户注册时间
}
