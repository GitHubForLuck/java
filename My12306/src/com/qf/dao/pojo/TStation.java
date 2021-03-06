package com.qf.dao.pojo;
// Generated 2017-7-11 12:41:52 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * TStation generated by hbm2java
 */
public class TStation implements java.io.Serializable {

	private String id;
	private String name;
	private String pinyin;
	private String region;
	private int range;
	private String company;
	private String address;
	private String con1;
	private String con2;
	private String con3;
	private String con4;
	private String con5;
	private Set TTrainsForEndstation = new HashSet(0);
	private Set TTrainsForStartstation = new HashSet(0);

	public TStation() {
	}

	public TStation(String id, String name, String pinyin, String region) {
		this.id = id;
		this.name = name;
		this.pinyin = pinyin;
		this.region = region;
	}

	public TStation(String id, String name, String pinyin, String region, int range, String company,
			String address, String con1, String con2, String con3, String con4, String con5, Set TTrainsForEndstation,
			Set TTrainsForStartstation) {
		this.id = id;
		this.name = name;
		this.pinyin = pinyin;
		this.region = region;
		this.range = range;
		this.company = company;
		this.address = address;
		this.con1 = con1;
		this.con2 = con2;
		this.con3 = con3;
		this.con4 = con4;
		this.con5 = con5;
		this.TTrainsForEndstation = TTrainsForEndstation;
		this.TTrainsForStartstation = TTrainsForStartstation;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getRange() {
		return this.range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCon1() {
		return this.con1;
	}

	public void setCon1(String con1) {
		this.con1 = con1;
	}

	public String getCon2() {
		return this.con2;
	}

	public void setCon2(String con2) {
		this.con2 = con2;
	}

	public String getCon3() {
		return this.con3;
	}

	public void setCon3(String con3) {
		this.con3 = con3;
	}

	public String getCon4() {
		return this.con4;
	}

	public void setCon4(String con4) {
		this.con4 = con4;
	}

	public String getCon5() {
		return this.con5;
	}

	public void setCon5(String con5) {
		this.con5 = con5;
	}

	public Set getTTrainsForEndstation() {
		return this.TTrainsForEndstation;
	}

	public void setTTrainsForEndstation(Set TTrainsForEndstation) {
		this.TTrainsForEndstation = TTrainsForEndstation;
	}

	public Set getTTrainsForStartstation() {
		return this.TTrainsForStartstation;
	}

	public void setTTrainsForStartstation(Set TTrainsForStartstation) {
		this.TTrainsForStartstation = TTrainsForStartstation;
	}

}
