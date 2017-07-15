package com.qf.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qf.dao.pojo.TStation;
import com.qf.dao.pojo.TTrain;
import com.qf.service.iservice.ITTrainService;
@Controller("ttrainAction")
@Scope("prototype")
public class TTrainAction implements ModelDriven<TTrain>, RequestAware {
	@Autowired
	@Qualifier("ttrainService")
	private ITTrainService ttrianService;
	private TTrain train = new TTrain();
	private Map<String, Object> requestMap;
	private String type;
	private String proName;
	private String objVal;
	
	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap=requestMap;
	}

	@Override
	public TTrain getModel() {
		// TODO Auto-generated method stub
		return train;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getObjVal() {
		return objVal;
	}

	public void setObjVal(String objVal) {
		this.objVal = objVal;
	}
	
	public String save(){
		return ttrianService.save(train);
		
	}
	public String update(){
		return ttrianService.update(train);
	}
	public String delete(){
		return ttrianService.delete(train);	
	}
	public String findById(){
		String msg="error";
		TTrain train2 = ttrianService.findById(train.getId());
		if(train2!=null){
			List<TTrain> trainList = new ArrayList<>();
			trainList.add(train2);
			requestMap.put("train", trainList);
			msg="success";
		}
		return msg;	
	}
	public String findAll(){
		String msg="error";
		List<TTrain> trainList = ttrianService.findAll();
		if(trainList!=null && trainList.size()>0){
			requestMap.put("trainList", trainList);
			msg="success";
		}
		return msg;
	}
	public String findProperty(){
		String msg="error";
		
		List<TTrain> trainList = ttrianService.findByProperty(proName, objVal);
		if(trainList!=null && trainList.size()>0){
			if("update".equals(type)){
				requestMap.put("train", trainList);
				msg="updatesuccess";
			}
			requestMap.put("trainList", trainList);
			msg="success";
		}
		return msg;
		
	}
	
}
