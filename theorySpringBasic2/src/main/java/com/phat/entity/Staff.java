package com.phat.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Staff {
	String staffname;
	String address;
	String age;
	Manager manager; 
	List<String> list;
	List<Manager> listobject;
	Map<String, Object> map;
	Properties properties;
	
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Staff() {
		this.staffname = "trantuanphat";
	}
	
	public String getStaffname() {
		return staffname;
	}



	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}

	
	public void Start() {
		System.out.println("hello init");
	}
	
public void Detroys() {
	System.out.println("hello destroys");
	}


	public void getMessage()
	{
		System.out.println("name"+staffname +" age"+ age + "address"+address);
	}
	
	
	
	//factory-method
	public static Staff newstaff() {
		Staff staff = new Staff();
		staff.setStaffname("someone");
		return staff;
	}
	
	
	//constructor bean
	public Staff(String staffname , String address)
	{
		this.staffname = staffname;
		this.address = address;
	}

	public Staff(String staffname , String address, String age)
	{
		this.staffname = staffname;
		this.address = address;
		this.age = age;
	}
	
	
	 //references
public Staff(Manager manager)
{
	this.manager = manager;
}


	
	//list
public List<String> getList() {
	return list;
}

public void setList(List<String> list) {
	this.list = list;
}
	//list object
public List<Manager> getListobject() {
	return listobject;
}

public void setListobject(List<Manager> listobject) {
	this.listobject = listobject;
}


//Map


public Map<String, Object> getMap() {
	return map;
}

public void setMap(Map<String, Object> map) {
	this.map = map;
}



//properties

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}


//auto write







}
