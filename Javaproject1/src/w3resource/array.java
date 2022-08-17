package w3resource;

import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("define the length of the array");
		int n= sc.nextInt();
		int array[]=new int[9];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("which element you want tosearch ");
		
		 
		//int sum=0;
		    //display the array
		System.out.println("the elements of the array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
			;
		}

	}

}
