package javaproject;

public class Animal {
	String name;
	int age;
	String leg_des;
	int cage_no;
	public Animal(String name, int age, String leg_des, int cage_no) {
		this.name = name;
		this.age = age;
		this.leg_des = leg_des;
		this.cage_no = cage_no;
	}
   
	 public void description() {
		System.out.println( "case 1:"+name+"age"+age+"legs"+leg_des+"cell no"+cage_no);
	 }

}
