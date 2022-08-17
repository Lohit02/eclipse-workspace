package string;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
	    String str= sc.nextLine();
	    str=str.toUpperCase();
	    String str1= sc.nextLine();
	    str1=str1.toUpperCase();
	    String st="";
	    st=st.toUpperCase();
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=str1.length()-1;j>=0;j--)
	        {
	            if(str.charAt(i)==str1.charAt(j));
	            {
	            	st=st+str.charAt(j);
	            	System.out.print(st+" ");
	            }
	        }
	        
	    }
	    if(st.equalsIgnoreCase(str1))
	        System.out.println("Anagrams");
	    else
	        System.out.println("Not Anagrams");

	}

}
