package Pattern;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = 1;
		int rows = 1;
		while (rows <= 2 * n - 1) {
			int i = 1;
			while (i <= stars) {
				System.out.print("* ");
				i++;
			}
			if (rows < n) {
				stars++;
				
			} else {
				stars--;
			}
			rows++;
			System.out.println();
		}
	}
}
