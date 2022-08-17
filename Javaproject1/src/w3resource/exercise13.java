package w3resource;

import java.util.Scanner;

public class exercise13 {
// FACTORS OF A NUMBERS
	public static void main(String[] args) {
		
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter the number");
           int n= sc.nextInt();
           int ans=factors_of_numbers(n);
           System.out.println( ans);
           
	}
           public static int factors_of_numbers(int num) {
        	   int ctr = 0;
               for(int i=1;i<=num;i++) {
            	   if(num%i==0)
            	   {
            		   ctr++;
            	   }
               }
               return ctr;
           }
}
