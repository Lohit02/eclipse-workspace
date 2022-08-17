package string;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String str= in.nextLine();
		String sc= str.toLowerCase();
		String str1= in.nextLine();
		String sc1=str1.toLowerCase();
		System.out.println(sc.contains(sc1));
		

	}

}
