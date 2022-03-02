package com.phat.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employeee")
public class Employee {
	@Id
	int idemployeee;
	String name;
	
	//@Column(name="")
	int age;
	public int getIdemployeee() {
		return idemployeee;
	}
	public void setIdemployeee(int idemployeee) {
		this.idemployeee = idemployeee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
