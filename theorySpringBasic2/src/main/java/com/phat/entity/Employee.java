package com.phat.entity;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="employeee")
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idemployeee")
	int idemployeee;
	
	@Column(name = "name")
	String name;
	//@Column(name="")
	@Column(name = "age")
	int age;

	
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "employeee")
	@JoinColumn(name="idemployeee")
	Set<Goods>goods; //data extra not match
	
	
	public Set<Goods> getGoods() {
		return goods;
	}
	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}
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
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employee() {
	
	}
	
	
}
