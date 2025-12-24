package String_2;

public class PrintSubstringLengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		LengthwiseSubstring(str);
	}

	public static void LengthwiseSubstring(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for(int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
