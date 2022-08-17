package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array24 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,3,54,87,98,77)) ;
		System.out.println("even functions");
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				//System.out.println("even functions");
				System.out.println(list.get(i));}
//			else
//				System.out.println("odd func");
		}System.out.println("odd functions");
		for(int i=0;i<list.size();i++) {
			//System.out.println("odd functions");
			if(list.get(i)%2!=0) {
				
				System.out.println(list.get(i));}
//			else
//				System.out.println("odd func");
		}
		
		
		
		
		
		
		//System.out.println(list.get(i));
//		for(int text:list) {
//			System.out.println(text);
//		}

	}

}
