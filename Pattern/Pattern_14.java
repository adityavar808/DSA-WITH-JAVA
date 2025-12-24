package Pattern;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = 1;
		int spaces = n - 1;
		int rows = 1;
		while (rows <= 2 * n - 1) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j++;
			}
			if(rows < n) {
				stars++;
				spaces--;
			}
			else {
				spaces++;
				stars--;
			}
			rows++;
			System.out.println();
		}
	}

}
