package com.mega.mvctest;

public class SkiDTO {
	String name;
	String tel;
	
	public SkiDTO(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "SkiDTO [name=" + name + ", tel=" + tel + "]";
	}
	
}
