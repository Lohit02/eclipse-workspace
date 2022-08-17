package array;
// search duplicate
public class Array12 {

	public static void main(String[] args) {
		int count=0;
		
         int arr[]= new int [] {1,23,1,45,8,0,65,0,8};
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        		 if(arr[i]==arr[j])
        			// count++;
        			 System.out.println(arr[j]);
        			 
        			 
        	 }
         }
        
       //  System.out.println(count);
	}

}
