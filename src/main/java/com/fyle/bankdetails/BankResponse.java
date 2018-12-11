package com.fyle.bankdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_branches")
public class BankResponse {
@Id
@Column(name="ifsc")
private String ifsccode;
@Column(name="bank_id")
private int bankid;
private String branch;
private String city;
private String district;
private String state;
@Column(name="bank_name")
private String name;
private String address;
public String getAdress() {
	return address;
}
public void setAdress(String address) {
	this.address = address;
}
public String getIfsccode() {
	return ifsccode;
}
public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public int getBankid() {
	return bankid;
}
public void setBankid(int bankid) {
	this.bankid = bankid;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
