package Recursion;

public class Fibonnaci {

	public static void main(String[] args) {
		int n=2;
		
		System.out.println(fibo(n-1)+fibo(n-2));
        for(int i=0;i<n;i++) {
        	System.out.print(fibo(i)+" ");
        }
	}
	  public static int fibo(int n){
	        if(n==0){
	            return 0;
	        }
	        // Base cases return itself 0 and 1
	        else if(n==1){
	            return 1;
	        }
	        else{
	        	return fibo(n-1)+fibo(n-2);
	        	//System.out.println(n);
	        }
	    }

}
