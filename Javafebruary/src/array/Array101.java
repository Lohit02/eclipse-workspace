package array;

import java.util.Scanner;

public class Array101 {

	public static void main(String[] args) {
	  Scanner sc=  new Scanner(System.in);
	  int n = sc.nextInt();
	  int sum=0;
	 int arr[]= new int [n];
	 
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 
	// System.out.println();
	 
	 
	 for(int i=0;i<n;i++) {
		 sum=sum+arr[i];
	 }
	  System.out.println(sum);

	}

}
