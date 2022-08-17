package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array34 {

	public static void main(String[] args) {
//		int [] arr=  {1,2,3,4,5};
//		int [] arr1= new int[arr.length];
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the position");
//		int n = sc.nextInt();
//		
//		for(int i=0;i<arr.length;i++) {
//			  if(i!=n) {
//				arr1[i]=arr[i];}
//			
//				
//			}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
		
		int arr[]= {1,2,3,45,5,6,7,56,8,9};
		System.out.println("give the index u want to delete:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=n;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		//System.out.println(Arrays.);
		System.out.println(Arrays.toString(arr));

	}

}
