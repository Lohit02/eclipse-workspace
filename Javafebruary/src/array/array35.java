package array;
import java.util.Arrays;
import java.util.Scanner;
public class array35 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int target= sc.nextInt();
		int  []arr= new int[6];
		
		for(int k=0;k<6;k++) {
			arr[k]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+"& "+arr[j]);
					
				}
			}
		}

	}

}
