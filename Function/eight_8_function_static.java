package Function;

public class eight_8_function_static {

	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 11;
		System.out.println("Hello");
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println(val);
	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val = 60;
		val = val + 5;
		return c - Sub(c, b);
	}
	
	public static int Sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
