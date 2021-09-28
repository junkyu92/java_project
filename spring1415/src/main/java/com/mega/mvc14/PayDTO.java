package com.mega.mvc14;

public class PayDTO {
	private int payid;
	private String memid;
	private String pay_data;
	private String pay_datetime;
	private int pay_total;
	
	public int getPayid() {
		return payid;
	}
	public void setPayid(int payid) {
		this.payid = payid;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getPay_data() {
		return pay_data;
	}
	public void setPay_data(String pay_data) {
		this.pay_data = pay_data;
	}
	public String getPay_datetime() {
		return pay_datetime;
	}
	public void setPay_datetime(String pay_datetime) {
		this.pay_datetime = pay_datetime;
	}
	public int getPay_total() {
		return pay_total;
	}
	public void setPay_total(int pay_total) {
		this.pay_total = pay_total;
	}
	@Override
	public String toString() {
		return "PayDTO [payid=" + payid + ", memid=" + memid + ", pay_data=" + pay_data + ", pay_datetime="
				+ pay_datetime + ", pay_total=" + pay_total + "]";
	}
	
}
