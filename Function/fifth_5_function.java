package Function;

public class fifth_5_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println(Add());
	}
	public static int Add() {
		int a = 8; 
		int b = 7;
		int c = a + b - Sub();
		return c;
	}
	
	public static int Sub() {
		int a = 9; 
		int b = 7;
		int c = a - b;
		return c;
	}
}
