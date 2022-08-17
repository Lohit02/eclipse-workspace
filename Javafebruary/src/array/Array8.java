package array;
// copy the elements of an array to a different array
public class Array8 {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,65,78};
		int arr2[]= new int [arr1.length];
		for(int i=0; i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			
		}
		System.out.println("arr2");
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i]+"");
		}
		//System.out.println(arr2);

	}

}
