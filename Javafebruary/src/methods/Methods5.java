package methods;

import java.util.Scanner;

public class Methods5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String str= sc.nextLine();
		System.out.println(count_space(str));

	}
	public static int count_space(String string) {
	int count=1;
	for(int i=0;i<string.length();i++) {
		if(string.charAt(i)==' ')
		{
			count++;
		}
	}return count;
	
	}

}
