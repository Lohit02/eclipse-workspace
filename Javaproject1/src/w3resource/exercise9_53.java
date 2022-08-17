package w3resource;

import java.util.Scanner;

public class exercise9_53 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int n= sc.nextInt();
		System.out.println("enter the 2nd umber:");
		int n1= sc.nextInt();
		System.out.println("enter the 3rd number");
		int n2= sc.nextInt();
		if(n1>n && n2>n1)
		{
			System.out.println(true);
		}else
			System.out.println(false);
	}

}
