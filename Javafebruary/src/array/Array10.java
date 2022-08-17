package array;
// find the maximum and minimum value of an array
public class Array10 {

	public static void main(String[] args) {
		int array[]= {1,34,2,56,7,0};
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}System.out.println("maximun element");
		System.out.println(max);
           for(int i=0;i<array.length;i++)
           {
        	   if(array[i]<max)
        		   max=array[i];
           }
           System.out.println("minimum element");
           System.out.println(max);
	}

}

