/*package methods;

import java.util.Scanner;

public class Methods6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		String str= sc.nextLine();
		System.out.println(Sum(str));
	}public static int Sum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum= sum+ str.charAt(i);
		}
		return sum;
	}

}*/


package methods;
import java.util.Scanner;
public class Methods6{
	  public static void main(String []  args) {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("enter the number");
		  int n=  sc.nextInt();
		  System.out.println(add_digits(n));
		  
	  }
	  public static double add_digits( int n) {
		  double sum=0;
		  while(n>0) {
			  sum=sum+n%10;
			  n=n/10;
		  }return sum;
	  }
}
