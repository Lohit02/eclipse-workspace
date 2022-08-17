package array;
//
public class Array2 {

	public static void main(String[] args) {
		int array[]= new int[] {5,67,89,8,0,9};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i]==array[j]) {
					System.out.println("duplicate element exists");}
//				else {
//					System.out.println("duplicate doesn't exist");
//				}
			}
		}
	}

}
