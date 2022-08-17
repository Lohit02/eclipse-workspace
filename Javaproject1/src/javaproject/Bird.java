package javaproject;

public class Bird {
	
	String name;
	String region;
	String colour;
	int age;
	public Bird(String name, String region, String colour, int age) {
		this.name = name;
		this.region = region;
		this.colour = colour;
		this.age = age;
	}
	public void des() {
		System.out.println("this is "+name+"from "+region+"region, is"+colour+"in colour & its age is"+ age);
	}

}
