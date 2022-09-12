package com.rewards.point.calculation.demo.model;

public class CustomerTransaction {
	
	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the dollarSpent
	 */
	public Integer getDollarSpent() {
		return dollarSpent;
	}
	/**
	 * @param dollarSpent the dollarSpent to set
	 */
	public void setDollarSpent(Integer dollarSpent) {
		this.dollarSpent = dollarSpent;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	String customerID;
	Integer dollarSpent;
	String month;

}
