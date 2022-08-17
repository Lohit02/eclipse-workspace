package string;

public class String9 {
	public static void main(String[ ] args) {
	char[] num= new char[]{'1','2','3','4'};
	String str= String.copyValueOf(num,1,3);
	System.out.print(str);
	
}
}
