package array;

import java.util.Scanner;

//search duplicate
public class Array3 {

	public static void main(String[] args) {
		Scanner ar= new Scanner(System.in);
		System.out.println("Enter the sixe of array:");
		int n=ar.nextInt();
		int array[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]= ar.nextInt();
		}
		System.out.println("which value you want to search");
		int x= ar.nextInt();
		for(int i=0;i<n;i++)
		{
			if(array[i]==x)
				{
				System.out.println("element is found at index"+"  "+i);
				}
			
		}
	}

}
