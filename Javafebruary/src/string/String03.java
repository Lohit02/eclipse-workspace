package string;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(str.codePointBefore(1));
	}

}
