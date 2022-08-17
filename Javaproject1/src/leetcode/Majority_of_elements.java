package leetcode;

import java.util.Scanner;

public class Majority_of_elements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A[] = {'1','5','5','1','4','5'};
		for(int i=0;i<=A.length;i++) {
			if(A[i]>A.length/2) {
				System.out.println(A[i]);
			}
		}
			

	}

}
