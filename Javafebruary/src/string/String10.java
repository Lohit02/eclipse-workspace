package string;

public class String10 {

	public static void main(String[] args) {
		String str="example.com" , str1= "Exercise.com";
		StringBuffer strbuf = new StringBuffer(str);
		System.out.println("comparing"+ str+"and"+strbuf+":"+str.contains(strbuf));
        System.out.println("comparing"+str1+"and"+strbuf+":"+str1.contains(strbuf));
	}

}
