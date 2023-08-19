package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {
public Home() {
	
}
	private String owner;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	private int doorNo;
	
	public void connect() {
		System.out.println("connecting to Internet");
	}
	
}
