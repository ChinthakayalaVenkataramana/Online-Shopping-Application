package com.MyShope.Beans;
import java.io.*;
@SuppressWarnings("serial")
public class CustomerBean implements Serializable {
 private String fname,lname,mail,pword,madal,dist,village;
 private long phno,pin;
 public CustomerBean() {}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPword() {
	return pword;
}
public void setPword(String pword) {
	this.pword = pword;
}
public String getMadal() {
	return madal;
}
public void setMadal(String madal) {
	this.madal = madal;
}
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public long getPin() {
	return pin;
}
public void setPin(long pin) {
	this.pin = pin;
}
 
}
