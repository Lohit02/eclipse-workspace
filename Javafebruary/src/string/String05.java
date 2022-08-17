package string;

public class String05 {

	public static void main(String[] args) {
		String str=" My name is Lohit";
		String str1= " MY friend name is bodhisattwa";
		int result= str.compareTo(str1);
		if(result>0) {
			System.out.println(str+"is greater than"+str1);
		}else if(result==0) {
			System.out.println(str+"is equalls to+str1");
		}else{
			System.out.println(str+"is less than "+str1);
		}

	}

}
