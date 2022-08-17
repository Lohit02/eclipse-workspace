package array;

import java.util.Scanner;

//insert an element in the specified portion of an array
public class Array9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1,2,3,45};
		System.out.println("enter the position you want to insert");
		int n = sc.nextInt();
		System.out.println("enter the value you want to insert");
		int x= sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(i==n)
			{
				arr[i]=x;
			}
		}
		System.out.println("display the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
