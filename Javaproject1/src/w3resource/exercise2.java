package w3resource;

import java.util.Scanner;//SWAPPING

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the 1st number:");
		int a= sc.nextInt();
		System.out.println("Input the 2nd number:");
		int b= sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
