package Pattern;

public class Pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int spaces = n-1;
		int number_i = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int val = 1;
			while(j <= number_i) {
				System.out.print(val + " ");
				val++;
				j++;
			}
			rows++;
			number_i += 2;
			spaces--;
			System.out.println();
		}
	}
}
