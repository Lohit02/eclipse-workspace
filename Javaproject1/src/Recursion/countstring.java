package Recursion;

import java.util.Scanner;

public class countstring {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = kb.nextLine();
        kb.close();
        System.out.println("The length of your string is: " + stringLength(s));
    }

    public static int stringLength(String s) {
        if (s.equals(""))
            return 0;
        else
            return stringLength(s.substring(1)) + 1;
    }

}
