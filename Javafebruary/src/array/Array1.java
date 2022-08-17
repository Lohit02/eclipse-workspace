package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//sort  a numeric array
public class Array1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int array[]= new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
