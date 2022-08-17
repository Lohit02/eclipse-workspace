package javaproject;

public class Human {
	String name;
	int age;
	int height_in_inches;
	String eyecolour;
	
	public Human(String name, int age, int height_in_inches, String eyecolour) {
		super();
		this.name = name;
		this.age = age;
		this.height_in_inches = height_in_inches;
		this.eyecolour = eyecolour;
	}

public void speak() {
	System.out.println("hello, my name is " +name);
	System.out.println("I am "+height_in_inches+" tall");
	System.out.println("my age is "+age);
	System.out.println("i have "+eyecolour+" eyes");
}
public void eat() {
	System.out.println("i am eating.....");
}
public void walk() {
	System.out.println("walking...");
}
public void work() {
	System.out.println("running");
}


}