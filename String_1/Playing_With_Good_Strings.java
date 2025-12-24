package String_1;

import java.util.Scanner;

public class Playing_With_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(vowelSubstring(s));
	}

	public static int vowelSubstring(String s) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (IsVowels(ch) == true) {
				count++;
			} else {
				max = Math.max(count, max);
				count = 0;
			}
		}
		max = Math.max(count, max);
		return max;
	}

	public static boolean IsVowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
