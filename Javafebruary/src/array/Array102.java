package array;

import java.util.Arrays;
import java.util.Scanner;
public class Array102 {
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		int []arr1= new int[n];
int c=0;int d=0;
for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr1[i]= sc.nextInt();
	}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr1[i]) {
			c++;
			}else if (arr[i]<arr1[i]){
				d++;
			}else {
				System.out.println("both are same");
			}
			
		}int[] result= {c,d};
		System.out.println(Arrays.toString(result));
	}
	}
	
	
	
	


