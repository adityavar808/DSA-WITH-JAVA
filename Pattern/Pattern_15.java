package Pattern;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = n;
		int spaces = 0;
		int rows = 1;
		while (rows <= 2 * n - 1) {
			int j = 1;
			while (j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while (i <= stars) {
				System.out.print("* ");
				i++;
			}
			if (rows < n) {
				stars--;
				spaces += 2;
			}
			else {
				stars++;
				spaces -= 2;
			}
			rows++;
			System.out.println();
		}
	}

}
