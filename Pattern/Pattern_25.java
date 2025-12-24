package Pattern;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int spaces = n - 1;
		int val = 1;
		int rows = 1;
		int number_i = 1;
		while (rows <= n) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= number_i) {
				System.out.print(val + "\t");
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
