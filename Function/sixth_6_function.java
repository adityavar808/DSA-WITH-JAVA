package Function;

public class sixth_6_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 7;
		int b = 11;
		System.out.println(Add(a, b));
	}

	public static int Add(int a, int b) {
		int c = a + b;
		return c - sub(c, b);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
