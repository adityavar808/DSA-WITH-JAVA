package String_1;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Substring is an in-built method

		String s = "AdityaVarshney";
		System.out.println(s.substring(0, 6));
		System.out.println(s.substring(6));
		
		PrintSubstring(s);
	}
	
	public static void PrintSubstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
