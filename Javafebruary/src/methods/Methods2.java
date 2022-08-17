package methods;

import java.util.Scanner;

public class Methods2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		average(int []arr);

	}
	
	private static void average(int [ ]arr) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum= sum+ arr[i];
		} 
		
	}

	

}
