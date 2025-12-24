package Pattern;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int stars = n;
		int spaces = 0;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= stars) {
				System.out.print("* ");
				j++;
			}
			
			rows++;
			stars--;
			spaces++;
			System.out.println();
		}
	}

}
