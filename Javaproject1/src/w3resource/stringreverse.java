package w3resource;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  the String");
		String  letters= sc.nextLine();	
		System.out.println(letters.length());

		String reverse=" ";
		
        System.out.print("Reverse string: ");
        for (int i = letters.length() - 1; i >= 0; i--) 
        {
            reverse=reverse+letters.charAt(i);
        }
        System.out.print(reverse);
   
		
	}

}
