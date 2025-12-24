package Pattern;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int space_1 = n - 1 ;
		int stars = 1;

		while (rows <= n) {
			int i = 1;
			while (i <= space_1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= stars) {
				if (j % 2 == 0) {
					System.out.print("  ");
					j++;
				} else {
					System.out.print("* ");
					j++;
				}
			}
			System.out.println();
			rows++;
			space_1--;
			stars += 2;
		}
	}

}
