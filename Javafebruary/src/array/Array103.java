package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array103 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String str= sc.nextLine().toLowerCase();
		String str1= sc.nextLine().toLowerCase();
		  if(str.length()!=str1.length()) {
			  System.out.println("Not anagrams");
		  }else {
			  
			  
			  char[] a= str.toCharArray();
			  char[] b=str1.toCharArray();
			  Arrays.sort(a);
			  Arrays.sort(b);
//			  System.out.println(Arrays.toString(a));
//			  System.out.println(Arrays.toString(b));
//			  System.out.println(a.equals(b));
//			  
			  if(Arrays.equals(a, b)) {
				  System.out.println("anagrams");
				  
			  }else
				  System.out.println("not anagrams");
		  }

	}

}
