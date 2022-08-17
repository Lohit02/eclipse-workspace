package array;

public class Array32 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,65,77};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==65||arr[i]==77) {
				System.out.println("one matched element found in index "+i);}
			
		}

	}

}
