package Pattern;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int number_i = 1;
		int spaces = n - 1;
		int val = 1;
		while (rows <= n) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int val_inner = val;
			while (j <= number_i) {
				if(j == 1 || j == number_i) {
					System.out.print(val_inner + " ");
				}
				else {
					System.out.print("0" + " ");
				}
				j++;
			}
			rows++;
			number_i += 2;
			spaces--;
			val++;
			System.out.println();
		}
	}
}