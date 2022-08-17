package w3resource;

import java.util.Scanner;
     //binary to decimal
public class exercise3 {

	public static void main(String[] args) {
		int i=0,j;
		int quot;
		int number[]= new int[100];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a= sc.nextInt();
		quot=a;
		while(quot!=0)
		{
			number[ i++]=quot%2;
			quot/=2;
		}
		for( j=i-1;j>=0;j--)
		{
			System.out.println(number [j]);
		}
		//System.out.println("\n");
	}

}
