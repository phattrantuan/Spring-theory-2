package com.phat.entity;

public class Manager extends Staff{
	String function;

	public String getFunction() {
		
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
	public Manager(String function, String name,String address)
	{
		super(name, address);
		this.function = function;
		
	}
	public Manager(String function)
	{
		
		this.function = function;
	}

}
