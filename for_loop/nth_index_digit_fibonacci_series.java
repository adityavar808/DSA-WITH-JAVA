package for_loop;

public class nth_index_digit_fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a); // For Series
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a); // For Last Element
	}

}
