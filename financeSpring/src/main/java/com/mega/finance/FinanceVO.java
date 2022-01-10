package com.mega.finance;

public class FinanceVO {
	int today, yesterday, high;
	String company, code;
	public FinanceVO(int today, int yesterday, int high, String company, String code) {
		super();
		this.today = today;
		this.yesterday = yesterday;
		this.high = high;
		this.company = company;
		this.code = code;
	}
	public int getToday() {
		return today;
	}
	public void setToday(int today) {
		this.today = today;
	}
	public int getYesterday() {
		return yesterday;
	}
	public void setYesterday(int yesterday) {
		this.yesterday = yesterday;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "FinanceVO [today=" + today + ", yesterday=" + yesterday + ", high=" + high + ", company=" + company
				+ ", code=" + code + "]";
	}
	
}
