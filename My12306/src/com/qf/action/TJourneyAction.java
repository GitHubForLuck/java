package com.qf.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TJourney;
import com.qf.service.iservice.ITJourneyService;

public class TJourneyAction extends ActionSupport implements ModelDriven<TJourney>, RequestAware, SessionAware {

	private static final long serialVersionUID = 1L;

	@Autowired
	@Qualifier("tJourneyService")
	private ITJourneyService tJourneyService;
	
	private Map<String, Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> requestMap) {
		// TODO Auto-generated method stub
		this.requestMap = requestMap;
	}

	private TJourney tJourney;
	@Override
	public TJourney getModel() {
		// TODO Auto-generated method stub
		return tJourney;
	}

}
