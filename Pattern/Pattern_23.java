package Pattern;

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int number = 1;
		int spaces = n - 1;
		while (rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= number) {
				System.out.print("1 ");
				j++;
			}
			rows++;
			number += 2;
			System.out.println();
			spaces--;
		}
	}

}
