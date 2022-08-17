package leetcode;
import java.util.Arrays;

import java.util.Scanner;

public class Two_sum {

	public static void main(String[] args) {
		System.out.println("enter the length of the array:");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the target value:");
		int t= in.nextInt();
		System.out.println("accepting the values of the array :");
		for(int i=0;i<n;i++) {
			arr[i]= in.nextInt();
		}
		System.out.println("the array is :");
		 System.out.println(Arrays.toString(arr));
		System.out.println("the output indexes are :");
		for(int i=0; i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i]+arr[j]==t);
				
			} System.out.println(arr[i]);
			System.out.println(arr[j]);
		}
		
	}

}
