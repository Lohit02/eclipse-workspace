package w3resource;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int x= sc.nextInt();
		System.out.println("enter the 2nd umber:");
		int y= sc.nextInt();
		System.out.println("enter the 3rd number");
		int z= sc.nextInt();
		
		System.out.println("the result is "+test (x,y,z,false));

	}

        public static boolean test (int p ,int q,int r,boolean xyz)
        {
        	return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
        }
}
