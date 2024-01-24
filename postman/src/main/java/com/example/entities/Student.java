package com.example.entities;

public class Student {
	String kodid;
	String name;
	String batch;
	public Student() {
		super();
	}
	public Student(String kodid, String name, String batch) {
		super();
		this.kodid = kodid;
		this.name = name;
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [kodid=" + kodid + ", name=" + name + ", batch=" + batch + "]";
	}
	public String getKodid() {
		return kodid;
	}
	public void setKodid(String kodid) {
		this.kodid = kodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
 
	
}
