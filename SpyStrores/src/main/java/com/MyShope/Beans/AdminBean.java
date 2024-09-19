package com.MyShope.Beans;
import java.io.*;
@SuppressWarnings("serial")
public class AdminBean implements Serializable{
 private String ComName,Mail,pword,code,location;
 
 public AdminBean() {}
public String getComName() {
	return ComName;
}
public void setComName(String comName) {
	ComName = comName;
}
public String getMail() {
	return Mail;
}
public void setMail(String mail) {
	Mail = mail;
}
public String getPword() {
	return pword;
}
public void setPword(String pword) {
	this.pword = pword;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
 
}