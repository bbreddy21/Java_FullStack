package com.simplilearn.collection;

public class Student {
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
