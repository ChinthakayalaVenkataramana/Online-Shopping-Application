package com.MyShope.Beans;
import java.io.*;
@SuppressWarnings("serial")
public class OrderBean implements Serializable {
private String category,img,pmodel,quality,mail,date;
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

private double  price;
private byte Quantity;
 public OrderBean() {}
 
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public String getPmodel() {
	return pmodel;
}
public void setPmodel(String pmodel) {
	this.pmodel = pmodel;
}
public String getQuality() {
	return quality;
}
public void setQuality(String quality) {
	this.quality = quality;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public byte getQuantity() {
	return Quantity;
}

public void setQuantity(byte quantity) {
	Quantity = quantity;
}

 
}
