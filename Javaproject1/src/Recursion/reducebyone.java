package Recursion;

public class reducebyone {

	public reducebyone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
bypassing(4);
	}
   public static void bypassing(int val) {
	   if(val>=1)
		   bypassing(val-1);
	   System.out.println(val);
   }
}
