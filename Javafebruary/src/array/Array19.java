package array;

import java.util.Scanner;

public class Array19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the row length for matrix ");
		int m= sc.nextInt();
		System.out.println("enter the coloum length for matrix ");
		int n= sc.nextInt();
		
		int arr1[][] = new int [m][n];
		int arr2[][]= new int [m][n];
		int sum[][]= new int [m][n];
		// input of 1st matrix
		System.out.println("1st matrix is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]= sc.nextInt();
			}
		}
		//input of 2nd matrix
		System.out.println("2nd matrix is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		// code to add 
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j]= arr1[i][j]+ arr2[i][j];
			}
		}
		System.out.println("after add the 2 matrixes");
		//display
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sum[i][j]+" \t");
				//System.out.println(Arrays.toString(sum));
				
			}System.out.println();
		}
	}

}
