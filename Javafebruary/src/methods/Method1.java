package methods;
import java.util.Scanner;
public class Method1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		add(a,b);

	}
     public static void add(int p,int q) {
    	 System.out.println(p+q);
     }
}
