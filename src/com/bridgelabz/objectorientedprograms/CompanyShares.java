package com.bridgelabz.objectorientedprograms;

public class CompanyShares {
	private String stockSymbol;
	private int numberOfShares;
	private String dateTime;
	private double price;

	public CompanyShares(String symbol, int numberOfShares,double price,String dateTime) {
		this.stockSymbol = symbol;
		this.numberOfShares = numberOfShares;
		this.price = price;
		this.dateTime = dateTime;
	}
	public String getSymbol() {
		return stockSymbol;
	}
	public int getNumberOfShare() {
		return numberOfShares;
	}
	public double getPrice() {
		return price;
	}
	public String getDateTime() {
		return dateTime; 
	}
	public double getValue() {
		return numberOfShares*price;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public void setDateTime(String dateTime) {
		this.dateTime =dateTime;
	}
	@Override
	public String toString() {
		return "Stock Symbol: "+stockSymbol+" Number of Shares: "+numberOfShares+" price of Share: "+price+" Date and Time: "+dateTime+"\n";
	}

}
