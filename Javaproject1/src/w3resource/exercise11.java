package w3resource;
import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Input New number :");
		int n= in .nextInt();
		
		double peri= 2*Math.PI*n;
		double area= Math.PI*n*n;
		System.out.println("perimeter ="+ peri);
		System.out.println(("area ="+area));

	}

}
