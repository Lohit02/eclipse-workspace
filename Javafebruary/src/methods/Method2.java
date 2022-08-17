//package methods;
//import java.util.Scanner;//average of an array
//import java.util.ArrayList;
//public class Method2 {
//
//	public static void main(String[] args) {
//		
//      Scanner sc= new Scanner(System.in);
//       ArrayList<Integer> list= new ArrayList<Integer>(5);
//       for(int i=0;i<5;i++) {
//    	   int a= sc.nextInt();
//    	   
//       }
//       
//       function(list);
//       
//       System.out.println(list);
//	}
//	public static void function(ArrayList<Integer>list) {
//		list.add(20);
//		
//		
//		
//	}
////	public static void display() {
////		System.out.println(list);
////	}
//
//}
  // Java program to pass an
// ArrayList as an argument
package methods;
import java.util.ArrayList;

public class Method2 {

	public static void main(String[] args)
	{

		// Creating an ArrayList Object of Integer type
		ArrayList<Integer> list = new ArrayList<>();
		// Inserting some Integer values in ArrayList
		list.add(3);
		list.add(57);
		list.add(7);

		// list after insertions : [3, 57, 7]

		// Displaying the ArrayList
		System.out.print("ArrayList after insertions: ");
		display(list);

		// The changes made to the ArrayList inside this
		// function will not affect the original ArrayList
		// that we pass to it as we are simply creating the
		// new instance of ArrayList and making our
		// parameterList point to it
		callByValue(list);

		// list after function call : [3, 57, 7]

		// displaying the ArrayList after calling
		// callByValue
		System.out.print(
			"ArrayList after the function call: ");
		display(list);
	}

	public static void
	callByValue(ArrayList<Integer> parameterList)
	{

		// Creating a new instance of ArrayList
		parameterList = new ArrayList<>();

		// Inserting Integer values to the new ArrayList
		// created inside the function
		parameterList.add(88);
		parameterList.add(200);
		parameterList.add(89);

		// Displaying our new ArrayList
		System.out.print(
			"New ArrayList inside the function: ");
		display(parameterList);
	}

	// Function to display the array List
	public static void display(ArrayList<Integer> list)
	{
		System.out.println(list);
	}
}
