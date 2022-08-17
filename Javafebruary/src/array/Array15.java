package array;

public class Array15 {

	public static void main(String[] args) {
		String [] arr= {"L","o","h","I","T"};
		String []arr2= {"Lohit","kumar"};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
//				else 
//					System.out.println("nothing same");
			}
		}

	}

}
