package DSA;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr []= {12,43,67,89};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void bubble(int arr[]) { 
		int n= arr.length;
		int temp=0;
		for( int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
					
				}
			}
		
	}
   
    	
    }
	
			
		
	
}
