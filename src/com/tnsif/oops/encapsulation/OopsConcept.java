package com.tnsif.oops.encapsulation;

public class OopsConcept {
private static int count = 0;	
private  final int serialNum ;
private String Name;
private int age;


public OopsConcept(String name, int age) {
	
	this.serialNum = ++count;
	this.Name = name;
	this.age = age;
}

public OopsConcept() {
	// TODO Auto-generated constructor stub
   this.serialNum = ++count;
}

public int getSerialNum() {
	return serialNum;
}
//public void setSerialNum(int serialNum) {
//	this.serialNum = serialNum;
//}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public static int getCount() {
	return count;
}

@Override
public String toString() {
	return "OopsConcept [serialNum=" + serialNum + ", Name=" + Name + ", age=" + age + "]";
}



}
