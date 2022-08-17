package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Array20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String my_array[]= new String[] {"python","java","array","lohit"};
//		ArrayList<String> list= new ArrayList<String>(Arrays.asList(my_array));
//		System.out.println(list);
//		list.add("mango");
//		System.out.println(list);
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("mango");
		list1.add("apple");
		list1.add("banana");
		list1.add("coconut");
		System.out.println(list1);
		list1.add(2, "lohit");
		System.out.println(list1);
             Collections.sort(list1);
             System.out.println(list1);
	}

}
