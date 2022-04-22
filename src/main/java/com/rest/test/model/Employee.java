package com.rest.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "samp1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int eid;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}
