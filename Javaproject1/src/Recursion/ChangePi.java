package Recursion;

import java.util.Scanner;

public class ChangePi {

	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
	        System.out.println("Enter a String: ");
	        String s = kb.nextLine();
	        kb.close();
	        System.out.println("The length of your string is: " + Pi(s));
	}
	public static String Pi(String str) {
		 if (str.equals("") || str.length() < 2) return str;

		  if (str.charAt(0) == 'p' && str.charAt(1) == 'i')

		    return "3.14" + Pi(str.substring(2));

		  return str.charAt(0) + Pi(str.substring(1));
		
		
	}

}
