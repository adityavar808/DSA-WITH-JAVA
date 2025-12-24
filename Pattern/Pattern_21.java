package Pattern;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int stars = 1;
		int space = (n * 2) - 3;
		while (rows <= n) {
			int i = 1;
			while (i <= stars) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(rows == n) {
				k = 2;
			}
			while (k <= stars) {
				System.out.print("* ");
				k++;
			}
			rows++;
			space -= 2;
			stars++;
			System.out.println();
		}
	}

}
