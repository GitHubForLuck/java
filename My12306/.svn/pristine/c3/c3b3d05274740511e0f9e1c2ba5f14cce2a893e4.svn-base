package com.qf.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TOrders;
import com.qf.dao.pojo.TTicket;
import com.qf.dao.pojo.TUser;
import com.qf.service.iservice.ITOrdersService;

@Controller("tOrdersAction")
public class TOrdersAction extends ActionSupport implements ModelDriven<TOrders>,RequestAware{

	private static final long serialVersionUID = 1L;

	@Autowired
	@Qualifier("tOrdersService")
	private ITOrdersService tOrdersService;
	
	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> requestMap) {
		// TODO Auto-generated method stub
		this.requestMap = requestMap;
	}

	private TOrders tOrders = new TOrders();
	@Override
	public TOrders getModel() {
		// TODO Auto-generated method stub
		return tOrders;
	}

	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	private String userid;
	private String tkid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTkid() {
		return tkid;
	}
	public void setTkid(String tkid) {
		this.tkid = tkid;
	}
	
	
	public String findAll(){
		String msg = "error";
		List<TOrders> oList = tOrdersService.findAll();
		if (oList != null && oList.size() > 0) {
			requestMap.put("oList", oList);
			msg = "success";
		}
		return msg;
	}
	
	public String findById(){
		String msg = "error";
		TOrders tOrders1 = tOrdersService.findById(tOrders.getId());
		List<TOrders> oList = new ArrayList<>();
		if (tOrders1 != null) {
			if ("ordersupdate".equals(type)) {
				requestMap.put("tOrders", tOrders1);
				msg = "updatesuccess";
				type = null;
			}else {
				oList.add(tOrders1);
				requestMap.put("oList", oList);
				msg = "success";
			}
		}
		return msg;
	}
	
	public String changeStatusById(){
		return tOrdersService.changeStatusById(tOrders.getId());
	}
	
	public String update(){
		TTicket tTicket = new TTicket();
		tTicket.setId(Integer.parseInt(tkid));
		TUser tUser = new TUser();
		tUser.setId(Integer.parseInt(userid));
		tOrders.setTTicket(tTicket);
		tOrders.setTUser(tUser);
		return tOrdersService.update(tOrders);
	}

}
