package com.capg.springcore.beans;

public class Mobile {
	
	private String brandName;
	private String modelName;
	
	private int price;
	private MobileDisplay mobiledisplay;
	
	//getters and setters
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MobileDisplay getMobiledisplay() {
		return mobiledisplay;
	}
	public void setMobiledisplay(MobileDisplay mobiledisplay) {
		this.mobiledisplay = mobiledisplay;
	}	

}//end of class
