package w3resource;
import java.util.Scanner;
public class exercise12 {

	public static void main(String[] args) {
		
		float avg=0;
		float sum=0;
		Scanner in= new Scanner(System.in);
		System.out.println("How many numbers you want to insert");
		int n= in.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=1;i<=n;i++)
		{
			int p= in.nextInt();
			sum=sum+p;
		}
		avg=sum/n;
		System.out.println("avarage is "+avg);
	}
}


