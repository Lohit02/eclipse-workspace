package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class common_prefix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String str1= sc.nextLine();
		String str2=" ";
		 char [] arr= str.toCharArray();
		 char[] arr1 = str1.toCharArray();
		 char[] arr2= str2.toCharArray();
		 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)==str1.charAt(i))
		 {
			 str2=str2+str.charAt(i);
			i++;
		 }
		 else 
			 System.out.println("there is no common prefix");

	}System.out.println(str2);

}
}
