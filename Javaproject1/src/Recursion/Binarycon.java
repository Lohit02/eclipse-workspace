package Recursion;

public class Binarycon {

	public static void main(String[] args) {
		int n=9;
	con(n);

	}
	public static void  con(int n) {
	if(n>0) {
		
		System.out.printf("%d",n%2);
		con(n/2);
	}
	}
}
