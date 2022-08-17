package string;

import java.util.Arrays;
import java.util.Scanner;

public class String30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine().replaceAll(" ", "");
		
		
		char[] arr= str.toCharArray();
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
