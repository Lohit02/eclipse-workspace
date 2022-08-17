package w3resource;
// multiplication Table
import java.util.Scanner;
public class exercse1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System  .in);
		System.out.println("Input new number");
		int n= in. nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+"*"+i + " ="
					+ "" +(n*i));
		}
 
	}

}
