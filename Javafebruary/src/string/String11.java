package string;

public class String11 {

	public static void main(String[] args) {
		char arr[] = new char [] {'1','2','3','4'};
		String str= String.copyValueOf(arr,1,3);
		System.out.println("the book contains "+str);

	}

}
