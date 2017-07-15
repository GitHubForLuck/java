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
import com.qf.service.iservice.ITStationService;

@Controller("tstationAction")
@Scope("prototype")
public class TStationAction implements ModelDriven<TStation>, RequestAware {
	@Autowired
	@Qualifier("tstationService")
	private ITStationService tstationService; 
	
	private Map<String, Object> requestMap;
	private String proName;
	private String objVal;
	private String type;

	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap=requestMap;
		// TODO Auto-generated method stub

	}

	private TStation  tstation = new TStation();
	@Override
	public TStation getModel() {
		// TODO Auto-generated method stub
		return tstation;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String save(){
		System.out.println("*********"+tstation);
		return tstationService.save(tstation);
	}
	
	public String update(){
		return	tstationService.update(tstation);
	}
	
	public String findAll(){
		String mString="error";
		List<TStation> stationList = tstationService.findAll();
		if(stationList!=null && stationList.size()>0){
			requestMap.put("stationList", stationList);
			mString="success";
		}
		return mString;
	}
	
	public String findById(){
		String msg="error";
		TStation station = tstationService.findById(tstation.getId());
		if(station!=null){
			
			List<TStation> stationList = new ArrayList<>();
			stationList.add(station);
			requestMap.put("stationList", stationList);
			msg="success";
		}
		return msg;
	}

	public String findByProperty(){
		String msg="error";
		List<TStation> stationList= tstationService.findByProperty(proName, objVal);
		
		if(stationList!=null && stationList.size()>0){
			if("update".equals(type)){
				requestMap.put("station", stationList.get(0));
				return "updatesuccess";
			}else{
				requestMap.put("stationList", stationList);
				msg="success";
			}
			
		}
		return msg;
		
	}
	
	public String changeStatusById(){
		System.out.println(tstation.getId());
		return tstationService.changeStatusById(tstation.getId());
	}
}
