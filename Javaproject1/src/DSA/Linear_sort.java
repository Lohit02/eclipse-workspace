package DSA;

public class Linear_sort {

	public static void main(String[] args) {
		int[] nums= {23,4,5,12,78,19};
		int target=19;
		int ans= linearsearch(nums,target);
		System.out.println(ans);
		int ans2= linearsearch2(nums,target);
		System.out.println(ans2);

	}
	static int linearsearch(int []arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index< arr.length;index++) {
			int element= arr[index];
			if(element==target) {
				return index;
			}
		}
		return -1;
	}
	
	static int linearsearch2( int []arr ,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0; index<arr.length;index++) {
			if(arr[index]==target) {
				return arr[index];
			}
		}return -1;
	}

}
