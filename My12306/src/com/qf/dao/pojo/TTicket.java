package com.qf.dao.pojo;
// Generated 2017-7-11 12:41:52 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TTicket generated by hbm2java
 */
public class TTicket implements java.io.Serializable {

	private int id;
	private TTrain TTrain;
	private Date tdate;
	private int gnumber;
	private int seatnumber;
	private String startstation;
	private String endstation;
	private int price;
	private String uname;
	private int utype;
	private String uidnumber;
	private int saletype;
	private Date saletime;
	private int status;
	private int revisetime;
	private String con1;
	private String con2;
	private String con3;
	private String con4;
	private String con5;
	private Set TOrderses = new HashSet(0);

	public TTicket() {
	}

	public TTicket(int id, TTrain TTrain, Date tdate, int gnumber, int seatnumber,
			String startstation, String endstation, int price, String uname, int utype, String uidnumber,
			int saletype, int revisetime) {
		this.id = id;
		this.TTrain = TTrain;
		this.tdate = tdate;
		this.gnumber = gnumber;
		this.seatnumber = seatnumber;
		this.startstation = startstation;
		this.endstation = endstation;
		this.price = price;
		this.uname = uname;
		this.utype = utype;
		this.uidnumber = uidnumber;
		this.saletype = saletype;
		this.revisetime = revisetime;
	}

	public TTicket(int id, TTrain TTrain, Date tdate, int gnumber, int seatnumber,
			String startstation, String endstation, int price, String uname, int utype, String uidnumber,
			int saletype, Date saletime, int status, int revisetime, String con1, String con2,
			String con3, String con4, String con5, Set TOrderses) {
		this.id = id;
		this.TTrain = TTrain;
		this.tdate = tdate;
		this.gnumber = gnumber;
		this.seatnumber = seatnumber;
		this.startstation = startstation;
		this.endstation = endstation;
		this.price = price;
		this.uname = uname;
		this.utype = utype;
		this.uidnumber = uidnumber;
		this.saletype = saletype;
		this.saletime = saletime;
		this.status = status;
		this.revisetime = revisetime;
		this.con1 = con1;
		this.con2 = con2;
		this.con3 = con3;
		this.con4 = con4;
		this.con5 = con5;
		this.TOrderses = TOrderses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TTrain getTTrain() {
		return this.TTrain;
	}

	public void setTTrain(TTrain TTrain) {
		this.TTrain = TTrain;
	}

	public Date getTdate() {
		return this.tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public int getGnumber() {
		return this.gnumber;
	}

	public void setGnumber(int gnumber) {
		this.gnumber = gnumber;
	}

	public int getSeatnumber() {
		return this.seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getStartstation() {
		return this.startstation;
	}

	public void setStartstation(String startstation) {
		this.startstation = startstation;
	}

	public String getEndstation() {
		return this.endstation;
	}

	public void setEndstation(String endstation) {
		this.endstation = endstation;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUtype() {
		return this.utype;
	}

	public void setUtype(int utype) {
		this.utype = utype;
	}

	public String getUidnumber() {
		return this.uidnumber;
	}

	public void setUidnumber(String uidnumber) {
		this.uidnumber = uidnumber;
	}

	public int getSaletype() {
		return this.saletype;
	}

	public void setSaletype(int saletype) {
		this.saletype = saletype;
	}

	public Date getSaletime() {
		return this.saletime;
	}

	public void setSaletime(Date saletime) {
		this.saletime = saletime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRevisetime() {
		return this.revisetime;
	}

	public void setRevisetime(int revisetime) {
		this.revisetime = revisetime;
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

	public Set getTOrderses() {
		return this.TOrderses;
	}

	public void setTOrderses(Set TOrderses) {
		this.TOrderses = TOrderses;
	}

}
