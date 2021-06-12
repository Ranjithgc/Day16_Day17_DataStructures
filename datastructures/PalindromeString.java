package datastructures;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String nstr = "";
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length/2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = t;
		}
		nstr = new String(ch);
		if(nstr.equalsIgnoreCase(str)) {
			System.out.println(str + "String is palindrome");
		} else {
			System.out.println(str + "String is not palindrome");
		}
	}
}
