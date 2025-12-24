package Function;

public class sixth_7_function_static {

	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println(val);
	}

	public static int Add(int a, int b) {
		int c = a + b;
		val = val + 5;
		return c - Sub(c, b);
	}
	
	public static int Sub(int a, int b) {
		int c = a - b;
		return c;
	}
	

}
