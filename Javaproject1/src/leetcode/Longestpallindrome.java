package leetcode;

import java.util.Scanner;

public class Longestpallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str=sc.nextLine();
		//char[] array= str.toCharArray();
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+ str.charAt(i);
		}
  System.out.println(reverse)
;	}

}
