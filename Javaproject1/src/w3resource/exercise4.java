package w3resource;

import java.util.Scanner;

public class exercise4 {
 
	//compare 2 numbers
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1= sc.nextInt();
		System.out.println("Enter tyhe 2nd number");
		int num =sc.nextInt();
		  if(num1==num)
			  System.out.println(num1 +"=" +num);
		  else if(num1>num)
			  System.out.println(num1+">"+num);
		  else
			  System.out.println(num1 +"<"+num);
			  
	}

}
