package com.qf.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TCarriage;
import com.qf.dao.pojo.TTrain;
import com.qf.service.iservice.ICarriageService;
import com.qf.service.iservice.ITTrainService;

@Controller("carriageAction")
public class CarriageAction implements RequestAware,ModelDriven<TCarriage>{


	@Autowired
	@Qualifier("carriageService")
	private ICarriageService carriageService;
	
	@Autowired
	@Qualifier("ttrainService")
	private ITTrainService ttrainService;

	private TCarriage tCarriage = new TCarriage();
	@Override
	public TCarriage getModel() {
		return tCarriage;
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
		tCarriage.setTTrain(train);
		return carriageService.save(tCarriage);
	}

	public String update() {
		TTrain train = ttrainService.findById(tid);
		tCarriage.setTTrain(train);
		return carriageService.update(tCarriage);
	}

	public String delete() {
		return carriageService.delete(tCarriage);
	}

	public String findAll() {
		String msg = "error";
		List<TCarriage> tCarriages = carriageService.findAll();;
		if (tCarriages != null) {
			requestMap.put("carriageList", tCarriages);
			msg = "success";
		}
		return msg;
	}

	public List<TCarriage> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String findById() {
		String msg = "error";
		TCarriage tCarriage2 = carriageService.findById(tCarriage.getId());
		if (tCarriage2 != null) {
			if ("update".equals(type)) {
				requestMap.put("carriage", tCarriage2);
				msg = "updatesuccess";
			} else {
				requestMap.put("carriage", tCarriage2);
				msg = "success";
			}
			
		}
		return msg;
	}

	public String findByProperties() {
		String msg = "error";
		TTrain train = new TTrain();
		train.setId(tid);
		tCarriage.setTTrain(train);
		List<TCarriage> tCarriages = carriageService.findByProperties(tCarriage);
		if (tCarriages != null && tCarriages.size() > 0) {
			requestMap.put("carriageList", tCarriages);
			msg = "success";
		}
		return msg;
	}


}
