package june;

public class Recursion {

	public Recursion() {
		
	}

	public static void main(String[] args) {
		
    sayHi(3); 
    
    
    
	}
	private static void sayHi(int val) {
		System.out.println("HI");
		if(val <=1) {
		return;
		}
	  sayHi(val-2);
	}

}
