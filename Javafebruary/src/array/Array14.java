package array;

public class Array14 {
   public static void main( String[] args) {
	   int arr2[]= {2,45,43,6};
	   int arr1[]= {4,45,76,9};
	  // int count=0;
	   for(int i=0;i<arr1.length;i++)
	   {
		   for(int i1=0;i1<arr2.length;i1++)
		   {
			   if(arr1[i]==arr2[i1])
				   System.out.println(arr1[i]);
				   
		   }
	   }

	}

}
