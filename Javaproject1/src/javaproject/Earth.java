package javaproject;

public class Earth {

	public static void main(String[] args) {
	Human a= new Human("Lohit", 75, 20, "brown");
	Human b= new Human("radhe",70,19,"blue");
	a.speak();
	b.speak();
	
	Animal l= new Animal("Lion", 12, "four legs", 2);
	l.description();
	Bird b1= new Bird("tiya","india","green",1);
	Bird b2= new Bird("salikh","india","black",3);
	b1.des();
	b2.des();
	
	
	}
}
