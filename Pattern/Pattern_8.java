package Pattern;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space_1 = 0;
		int space_2 = n - 2;
		int rows = 1;

		while (rows <= n / 2) {
			int i = 1;
			while (i <= space_1) {
				System.out.print("  ");
				i++;
			}

			System.out.print("* ");

			int j = 1;
			while (j <= space_2) {
				System.out.print("  ");
				j++;
			}

			System.out.print("* ");
			space_1++;
			space_2 -= 2;
			rows++;
			System.out.println();
		}

		int k = 1;
		while (k <= n / 2) {
			System.out.print("  ");
			k++;
		}
		System.out.print("* ");
		System.out.println();

		space_1 = (n / 2) - 1;
		space_2 = 1;
		rows = 1;

		while (rows <= n / 2) {
			int x = 1;
			while (x <= space_1) {
				System.out.print("  ");
				x++;
			}

			System.out.print("* ");

			int y = 1;
			while (y <= space_2) {
				System.out.print("  ");
				y++;
			}
			
			System.out.print("* ");
			space_1--;
			space_2 += 2;
			rows++;
			System.out.println();
		}
	}
}