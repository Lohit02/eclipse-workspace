package array;
//average value of the elements of an array
public class Array4 {

	public static void main(String[] args) {
		int array[]= new int [] {3,5,76,43,7};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=0;
				if(array[i]>array[j]);
				temp= array[i];
				array[i]=array[j];
				array[j]=temp;
					
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
