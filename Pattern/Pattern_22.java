package Pattern;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = n;
		int spaces = 0;
		int rows = 1;
		while(rows <= n) {
			int i = 1;
			if(rows == i) {
				i = 2;
			}
			while(i <= stars) {
				System.out.print("* ");
				i++;
			}
			int k = 2;
			while(k <= spaces) {
				System.out.print("  ");
				k++;
			}
			int j = 1;
			while(j <= stars) {
				System.out.print("* ");
				j++;
			}
			rows++;
			stars--;
			spaces += 2;
			System.out.println();
		}
	}

}
