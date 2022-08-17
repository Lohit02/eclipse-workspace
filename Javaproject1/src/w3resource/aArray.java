package w3resource;

import java.util.Scanner;

public class aArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("define the size of array");
        int n= sc.nextInt();
        int array[]= new int [n];
        for(int i=0;i<n;i++)
        {
        	array[i]=sc.nextInt();
        }
        
       // System.out.println("which value you wat to search");
      //  int x= sc.nextInt();
        
        
        
        for(int i=n-1;i>=0;i--)
        {
        	System.out.println(array[i]);
        	//if(array[i]==x)
        		//System.out.println("element is found at index"+i);
        }
        		
	}

}
