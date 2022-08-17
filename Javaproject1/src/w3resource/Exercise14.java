package w3resource;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int x= sc.nextInt();
		System.out.println("enter the 2nd number:");
		int y= sc.nextInt();
		System.out.println(result(x,y));

	}
       public static int result (int x, int y)
       {
    	   if(x==y) {
    		   return 0;
    	   }
           if(x%6==y%6)
        	   return ((x>y)?x:y);
		   return ((x<y)?x:y);
           
       }
}
