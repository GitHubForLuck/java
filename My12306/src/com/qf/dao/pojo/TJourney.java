package com.qf.dao.pojo;
// Generated 2017-7-11 12:41:52 by Hibernate Tools 4.3.1.Final

/**
 * TJourney generated by hbm2java
 */
public class TJourney implements java.io.Serializable {

	private int id;
	private int journeyfrom;
	private int journeyto;
	private int area;
	private int permile;
	private String con1;
	private String con2;
	private String con3;
	private String con4;
	private String con5;

	public TJourney() {
	}

	public TJourney(int id, int journeyfrom, int journeyto, int area) {
		this.id = id;
		this.journeyfrom = journeyfrom;
		this.journeyto = journeyto;
		this.area = area;
	}

	public TJourney(int id, int journeyfrom, int journeyto, int area, int permile,
			String con1, String con2, String con3, String con4, String con5) {
		this.id = id;
		this.journeyfrom = journeyfrom;
		this.journeyto = journeyto;
		this.area = area;
		this.permile = permile;
		this.con1 = con1;
		this.con2 = con2;
		this.con3 = con3;
		this.con4 = con4;
		this.con5 = con5;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJourneyfrom() {
		return this.journeyfrom;
	}

	public void setJourneyfrom(int journeyfrom) {
		this.journeyfrom = journeyfrom;
	}

	public int getJourneyto() {
		return this.journeyto;
	}

	public void setJourneyto(int journeyto) {
		this.journeyto = journeyto;
	}

	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPermile() {
		return this.permile;
	}

	public void setPermile(int permile) {
		this.permile = permile;
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

}
