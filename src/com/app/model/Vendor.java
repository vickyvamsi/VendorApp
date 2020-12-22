package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VendorTab")
public class Vendor {

	@Id
	@Column(name="Ven_Id")
	private int venId;
	@Column(name="v_Code")
	private String venCode;
	@Column(name="v_name")
	private String venName;
	@Column(name="v_Type")
	private String venType;
	@Column(name="v_addr")
	private String venAddr;
	@Column(name="v_idType")
	private String venIdType;
	@Column(name="v_idNum")
	private String venIdNum;
	@Column(name="v_dsc")
	private String venDsc;
	
	public Vendor() {
		super();
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}

	public Vendor(int venId, String venCode, String venName, String venType,
			String venAddr, String venIdType, String venIdNum, String venDsc) {
		super();
		this.venId = venId;
		this.venCode = venCode;
		this.venName = venName;
		this.venType = venType;
		this.venAddr = venAddr;
		this.venIdType = venIdType;
		this.venIdNum = venIdNum;
		this.venDsc = venDsc;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenCode() {
		return venCode;
	}

	public void setVenCode(String venCode) {
		this.venCode = venCode;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenType() {
		return venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getVenAddr() {
		return venAddr;
	}

	public void setVenAddr(String venAddr) {
		this.venAddr = venAddr;
	}

	public String getVenIdType() {
		return venIdType;
	}

	public void setVenIdType(String venIdType) {
		this.venIdType = venIdType;
	}

	public String getVenIdNum() {
		return venIdNum;
	}

	public void setVenIdNum(String venIdNum) {
		this.venIdNum = venIdNum;
	}

	public String getVenDsc() {
		return venDsc;
	}

	public void setVenDsc(String venDsc) {
		this.venDsc = venDsc;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venCode=" + venCode + ", venName="
				+ venName + ", venType=" + venType + ", venAddr=" + venAddr
				+ ", venIdType=" + venIdType + ", venIdNum=" + venIdNum
				+ ", venDsc=" + venDsc + "]";
	}
	
	
	
}
