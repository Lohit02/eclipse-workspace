package leetcode;

public class test {

	
		public static int[] removeDuplicate(int arr[], int n) 
		{
			 if (n == 0 || n == 1) {
			        return n;
			    }
			    Arrays.sort(arr);  
			    int j = 0;
			    for ( int i = 0; i < n ; i++) {
			        if (arr[i] != arr[i-1]) {
			            arr[++j] = arr[i];
			        }
			    }
			    return j;
		         
		
		}
		public static void main (String[] args)
		{
		    int arr[] = {1, 3, 5, 5, 7, 9};
		    int n = arr.length;
		    
		    // calling function when number of elements in array is greater than 1
		    if (n > 1)
		    {
		        int[]arr1=removeDuplicate(arr, n);
		    }
		}

	}


