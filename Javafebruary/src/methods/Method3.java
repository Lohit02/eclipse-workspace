package methods;
import java.util.*;
public class Method3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int p= sc.nextInt();
		int q= sc.nextInt();
		int r= sc.nextInt();
		average(p,q,r);

	}
     public static void average(int x, int y,int z) {
    	 System.out.println((x+y+z)/3);
     }
}
