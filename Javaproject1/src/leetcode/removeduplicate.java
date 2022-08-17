package leetcode;

import java.util.Arrays;

public class removeduplicate {
	
	public static void removeelements(int []arr, int n) {
		
		int j=0;
		int temp[]= new int[n];
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]= arr[i];
				j++;
			}
		}
		temp[j++]=temp[n-1];
		
		  for (int i = 0; i < j; i++)
		    {
		    	arr[i] = temp[i];
		    }
		  System.out.println(Arrays.toString(arr));  
		  for (int i = 0; i < j; i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		int[] arr= {1,4,6,8,0,1,6,7};
		int n= arr.length;
		if(n>1) {
			removeelements(arr,n);
		}
		
		
		        
	        }
	}


