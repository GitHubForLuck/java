package com.java.web;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.bean.Users;
import com.java.exception.ServiceException;
import com.java.service.IUsersService;
import com.java.utils.PageUtils;

@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	@Qualifier("usersService")
	IUsersService usersService;
	
	@RequestMapping("list")
	public String selectByPage(
			@RequestParam(value="pageNumber",defaultValue="1",required=false) Integer pageNumber,
			@RequestParam(value="pageSize",required=false,defaultValue="3")Integer pageSize,
			Map<String,Object> map) {
		Integer totalrow = usersService.selectTotalrow();
		PageUtils pageUtils = new PageUtils(totalrow, pageNumber, pageSize);
		pageUtils = usersService.selectByPage(pageUtils);
		map.put("pageUtils", pageUtils);
		return "/pages/users/list.jsp";
	}
	
	@ResponseBody
	@RequestMapping("list2")
	public PageUtils selectByPage2(
			@RequestParam(value="pageNumber",defaultValue="1",required=false) Integer pageNumber,
			@RequestParam(value="pageSize",required=false,defaultValue="3")Integer pageSize) {
		Integer totalrow = usersService.selectTotalrow();
		PageUtils pageUtils = new PageUtils(totalrow, pageNumber, pageSize);
		pageUtils = usersService.selectByPage(pageUtils);
		return pageUtils;
	}
	
	
	/*
	 * 用户登录
	 */
	@RequestMapping("login")
	public String login(
			@RequestParam("uname") String uname,
			@RequestParam("upwd") String upwd,
			@RequestParam(value="validateCode",required=true) String validateCode,
			HttpServletRequest request) {
		String verCode = (String) request.getSession().getAttribute("verCode");
		if (!validateCode.equalsIgnoreCase(verCode)) {
			request.setAttribute("msg", "验证码错误！");
			return "/pages/users/login.jsp";
		}
		Users users = usersService.login(uname, upwd);
		if (null == users) {
			request.setAttribute("msg", "用户名或密码错误！");
			
			return "/pages/users/login.jsp";
		}
		return "/users/list";
	}
	
	/*
	 * 用户注册
	 */
	@RequestMapping(value="register/{action}/{emailcode}",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView register(Users users,
			@PathVariable("action") String action,
			@PathVariable("emailcode") String emailcode) {
		System.out.println(action);
		ModelAndView mav = new ModelAndView();
		if ("insert".equals(action)) {
			//注册
			//生成用户ID
			String uid = UUID.randomUUID().toString();
			//生成用户注册时间
			Date updatetime = new Date();
			users.setUid(uid);
			users.setUpdatetime(updatetime);
			int row = usersService.insert(users);
			if (row == 0) {
				mav.setViewName("/pages/users/register.jsp");
			}
			mav.setViewName("/pages/users/login.jsp");
		} else if ("activate".equals(action)) {
			//激活
			Users users2 = usersService.selectByProperty("emailcode", emailcode);
			String email = users2.getEmail();		//获取邮箱地址
			System.out.println("******************************************88888********");
			System.out.println(emailcode);
			try {
				usersService.processActivate(email, emailcode);		//调用激活方法
				mav.setViewName("/pages/users/ativate_success.jsp");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				mav.addObject("msg", e.getMessage());
				mav.setViewName("/pages/users/ativate_failure.jsp");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return mav;
		
		
	}
	
	/*
	 * 根据属性名、属性值查找
	 */
	@RequestMapping("selectByProperty")
	@ResponseBody
	public String selectByProperty(
			@RequestParam("propName")String propName,
			@RequestParam("propVal")Object propVal){
		String result="1";
		Users users = usersService.selectByProperty(propName, propVal);
		if (null==users) {
			result="0";
		}
		return result;
	}
	
}
