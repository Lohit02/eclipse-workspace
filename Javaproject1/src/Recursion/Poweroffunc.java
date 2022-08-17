package Recursion;

public class Poweroffunc {

	public static void main(String[] args) {
	float result=Poweroffunc.pow(10, 3);	
	System.out.println(result);
	}
	public  static float pow(float a,float n) {
		float res=0;
		if(n==0) {
			return 1;
		}else if(n<0)
		{
			res= res*pow(a,n+1);
					
		}else if(n>0) {
			res=res*pow(a,n-1);
		}return res;
	}

}
