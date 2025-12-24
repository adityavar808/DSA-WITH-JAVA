package String_1;

public class equalsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s3 = new String("hello");
		
		System.out.println(equalsString(s1,s3));
	}
	
	public static boolean equalsString(String s1, String s2) {
		if(s1 == s2) {
			// address matching
			return true;
		}
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
