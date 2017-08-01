package com.java.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.bean.Users;
import com.java.dao.IUsersDao;
import com.java.exception.ServiceException;
import com.java.service.IUsersService;
import com.java.utils.PageUtils;
import com.java.utils.foremail.MD5Utils;
import com.java.utils.foremail.SendEmailUtils;

@Service("usersService")
public class ServiceUsersImpl implements IUsersService {
	
	@Autowired
	IUsersDao iUsersDao;

	// ******************TODO用户注册**********************
	// 用户注册
	@Override
	public int insert(Users t) {
		// TODO Auto-generated method stub
		// 处理激活码
		t.setEmailcode(MD5Utils.encode2hex(t.getEmail()));

		// 保存注册信息
		int result = iUsersDao.insert(t);

		// 邮件内容
		StringBuffer sb = new StringBuffer("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
		sb.append("<a href=\"http://localhost:8080/gz_ssm/users/register/activate/");
		sb.append(t.getEmailcode());
		sb.append("\">http://localhost:8080/gz_ssm/users/register/activate/");
		sb.append(t.getEmailcode());
		sb.append("</a>");

		// 发送邮件
		SendEmailUtils.send(t.getEmail(), sb.toString());
		System.out.println("发送邮件");

		return result;
	}

	// ********************TODO*************************************************************************************
	/**
	 * 处理激活
	 * 
	 * @throws ParseException
	 */
	// 传递激活码和email过来
	public void processActivate(String email, String validateCode) throws ServiceException, ParseException {
		// 数据访问层，通过email获取用户信息
		Map<String, Object> map = new HashMap<>();
		map.put("propName", "email");
		map.put("propVal", email);
		Users users = iUsersDao.selectByProperty(map);
		// 验证用户是否存在
		if (users != null) {
			// 验证用户激活状态
			System.out.println("*********"+users.getStatus());
			if (users.getStatus() == 0) {
				/// 没激活
				Date currentTime = new Date();// 获取当前时间
				// 验证链接是否过期 (这里设计为永久)
				currentTime.before(users.getUpdatetime());
				if (currentTime.after(users.getUpdatetime())) {
					// 验证激活码是否正确
					if (validateCode.equals(users.getEmailcode())) {
						// 激活成功， //并更新用户的激活状态，为已激活
						System.out.println("==sq===" + users.getStatus());
						users.setStatus(1);// 把状态改为激活
						iUsersDao.update(users);
						System.out.println("==sh===" + users.getStatus());
					} else {
						throw new ServiceException("激活码不正确");
					}
				} else {
					throw new ServiceException("激活码已过期！");
				}
			} else {
				throw new ServiceException("邮箱已激活，请登录！");
			}
		} else {
			throw new ServiceException("该邮箱未注册（邮箱地址不存在）！");
		}

	}

	// ******************TODO**********************
	@Override
	public int update(Users t) {
		// TODO Auto-generated method stub
		return iUsersDao.update(t);
	}

	@Override
	public int deleteById(String uid) {
		// TODO Auto-generated method stub
		return iUsersDao.deleteById(uid);
	}

	@Override
	public Users selectById(String uid) {
		// TODO Auto-generated method stub
		return iUsersDao.selectById(uid);
	}

	@Override
	public List<Users> selectAll() {
		// TODO Auto-generated method stub
		return iUsersDao.selectAll();
	}

	// *********************TODO 分页查找**************************************

	@Override
	public PageUtils selectByPage(PageUtils pageUtils) {
		// TODO Auto-generated method stub
		List<Users> uList = iUsersDao.selectByPage(pageUtils);
		pageUtils.setList(uList);
		return pageUtils;
	}

	@Override
	public int selectTotalrow() {
		// TODO Auto-generated method stub
		return iUsersDao.selectTotalrow();
	}
	// *********************TODO**************************************

	// 用户登录
	@Override
	public Users login(String uname, String upwd) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("uname", uname);
		map.put("upwd", upwd);
		return iUsersDao.login(map);
	}

	// ************************TODO*************************************
	// 根据属性名和属性值查找
	@Override
	public Users selectByProperty(String propName, Object propVal) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("propName", propName);
		map.put("propVal", propVal);
		return iUsersDao.selectByProperty(map);
	}

}
