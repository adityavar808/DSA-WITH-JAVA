package Pattern;

public class Pattern_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int rows = 1;
		int stars = (n / 2) + 1;
		int spaces = -1;
		while (rows <= n) {
			int i = 1;
			while (i <= stars) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= spaces) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (rows == n || rows == 1) {
				k = 2;
			}
			while (k <= stars) {
				System.out.print("* ");
				k++;
			}
			if (rows <= n / 2) {
				stars--;
				spaces += 2;
			} else {
				stars++;
				spaces -= 2;
			}
			rows++;
			System.out.println();
		}
	}
}