package array;

import java.util.Arrays;

public class Array29 {

	public static void main(String[] args) {
		int arr []= {2,54,67,3,0,89};
		Arrays.sort(arr);
        double avg=0;
        int sum=0;
//        for(int i=1;i<arr.length-1;i++) {
//        	System.out.println(arr[i]);
//        	sum= sum+arr[i];
//        	
//        }
//
//        
//       System.out.println(sum);
//    //    avg= sum/arr.length-2;
//        System.out.println(sum/arr.length-2);
//        System.out.println(arr.length-2);
        
        int max=arr[0];
        int min=arr[arr.length-1];
        System.out.println(max);
       for(int i=0;i<arr.length;i++) {
    	   sum=sum+arr[i];
       }
       System.out.println(sum);
       avg=(sum-max-min)/arr.length;
       System.out.println(avg);
       
    
	}

}
