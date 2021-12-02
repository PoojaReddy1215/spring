package com.xworkz.printer;

public class Printer {
	private Brand brand;
	private Catagory catagory;
	private int price;
	private DealOfTheDay dealOfTheDay;
    
	public Printer() {
		System.out.println("invoked noarg constructor");
	}
	

	public Printer(Brand brand, Catagory catagory, int price, DealOfTheDay dealOfTheDay) {
		super();
		this.brand = brand;
		this.catagory = catagory;
		this.price = price;
		this.dealOfTheDay = dealOfTheDay;
	}


	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public DealOfTheDay getDealOfTheDay() {
		return dealOfTheDay;
	}

	public void setDealOfTheDay(DealOfTheDay dealOfTheDay) {
		this.dealOfTheDay = dealOfTheDay;
	}


	@Override
	public String toString() {
		return "Printer [brand=" + brand + ", catagory=" + catagory + ", price=" + price + ", dealOfTheDay="
				+ dealOfTheDay + "]";
	}
	
	
}
