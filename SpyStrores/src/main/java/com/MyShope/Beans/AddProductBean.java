package com.MyShope.Beans;
import java.io.*;
@SuppressWarnings("serial")
public class AddProductBean implements Serializable {
  private String category,pmodel,img,Qtly,brand;
  public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
private double price;
  public AddProductBean() {}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getPmodel() {
	return pmodel;
}
public void setPmodel(String pmodel) {
	this.pmodel = pmodel;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public String getQtly() {
	return Qtly;
}
public void setQtly(String qtly) {
	Qtly = qtly;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
  
}
