package string;

import java.util.Scanner;

public class Strin06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	
		String str=sc.nextLine();
		String str1= sc.nextLine();
		int result= str.compareTo(str1);
		if(result>0) {
			System.out.println(str+"is greater than"+str1);
		}else if(result==0) {
			System.out.println(str+"is equalls to+str1");
		}else{
			System.out.println(str+"is less than"+str1);

	}

}
}
