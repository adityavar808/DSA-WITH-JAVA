package String_1;

public class StringFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";

		String s3 = new String("Hello");
		String s4 = new String("World");
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
		
		System.out.println(s1 == s3);
		
		System.out.println(s1.length());
		
		
		String str_rev = "";
		for(int i = s1.length() - 1; i >= 0; i--) {
			str_rev += (s1.charAt(i));
		}
		
		System.out.println(str_rev);
	}

}
