package com.tnsif.oops.encapsulation;

public class EncapsulatinDemo {
public static void main(String[] args) {
	OopsConcept oops = new OopsConcept();
	
	oops.setAge(2);
	oops.setName("naveen");
	System.out.println(oops);
	OopsConcept oops1 = new OopsConcept();
	oops1.setAge(3);
	oops1.setName("naveen");
	System.out.println(oops1);
	OopsConcept oops2 = new OopsConcept();
	oops2.setAge(0);
	oops2.setName("naveen");
	System.out.println(oops2);
}
}
