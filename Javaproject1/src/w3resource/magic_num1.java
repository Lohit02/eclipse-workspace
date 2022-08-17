package w3resource;

public class magic_num1
{

	public static void main(String[] args) 
	{
		magic_num1 ob=new magic_num1();
		int n=1234;
		while(n>9)
		{
			n=ob.Sum(n);
		}
		if(n==1)
			System.out.println("Magic");
		else
			System.out.println("Not Magic");
	}
	    int Sum(int n) 
		{
			int sum=0;
			int n1;
			while(n!=0) 
			{
				n1=n%10;
				sum=sum+n1;
				n=n/10;
			}
			return sum;
		}
}
			
		

	

