package com.qf.action;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TRoute;
import com.qf.dao.pojo.TTrain;
import com.qf.service.iservice.IRouteService;
import com.qf.service.iservice.ITTrainService;

/**
 * 
 * @author Administrator
 *
 */
@Controller("routeAction")
public class RouteAction implements RequestAware,ModelDriven<TRoute>{


	@Autowired
	@Qualifier("routeService")
	private IRouteService routeService;
	
	@Autowired
	@Qualifier("ttrainService")
	private ITTrainService ttrainService;
	
	private TRoute tRoute = new TRoute();
	@Override
	public TRoute getModel() {
		return tRoute;
	}

	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap = requestMap;
	}
	
	private String tid;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTid() {
		return tid;
	}
	
	public void setTid(String tid) {
		this.tid = tid;
	}

	public String save() {
		TTrain train = ttrainService.findById(tid);
		tRoute.setTTrain(train);
		return routeService.save(tRoute);
	}

	public String update() {
		TTrain train = ttrainService.findById(tid);
		tRoute.setTTrain(train);
		return routeService.update(tRoute);
	}

	public String delete() {
		return routeService.delete(tRoute);
	}

	public String findAll() {
		String msg = "error";
		List<TRoute> tRoutes = routeService.findAll();;
		if (tRoutes != null) {
			requestMap.put("routeList", tRoutes);
			msg = "success";
		}
		return msg;
	}

	public List<TRoute> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String findById() {
		String msg = "error";
		TRoute tRoute2 = routeService.findById(tRoute.getId());
		if (tRoute != null) {
			if ("update".equals(type)) {
				requestMap.put("route", tRoute2);
				msg = "updatesuccess";
			} else {
				requestMap.put("route", tRoute2);
				msg = "success";
			}
		}
		return msg;
	}

	public String findByProperties() {
		String msg = "error";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date = format.format(tRoute.getStarttime());
		System.out.println(date);
		List<TRoute> tRoutes = routeService.findByProperties(tRoute);
		if (tRoutes != null && tRoutes.size()>0) {
			requestMap.put("routeList", tRoutes);
			msg = "success";
		}
		return msg;
	}


}
