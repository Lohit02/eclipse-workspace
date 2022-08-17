package methods;
import java.util.Scanner;
public class Methods1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int x= sc.nextInt();
		System.out.println("Enter the 2nd number");
		int y= sc.nextInt();
		System.out.println("Enter the 3rd number");
		int z= sc.nextInt();
		average(x,y,z);
        System.out.println(smallest(x,y,z));
	}
     public static void average(int a,int b,int c) {
    	 
    	 if(a>b&& a>c) {
    		 System.out.println(a+ "largest element");
    	 } else if(b>a && b>c) {
    		 System.out.println(b+  "largest elemnet");
    	 }else
    		 System.out.println(c+" "+"largest element");
     }
     public static int smallest( int a, int b,int c) {
		return Math.min(Math.min(a,b), c);
    	 
     }
}
