package Recursion;

public class Factorial{
	public static long factorialUsingRecursion(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * factorialUsingRecursion(n - 1);
	}
	public static void main(String []args) {
	long res=	factorialUsingRecursion(4);
	System.out.println(res);
	}
}