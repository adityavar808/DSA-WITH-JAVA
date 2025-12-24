package Pattern;

public class Pattern_4 {
	public static void main(String[] args) {
		int n = 5;
		int rows = 1;
		int spaces = n-1;
		int stars = 1;
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
			
			stars++;
			rows++;
			spaces--;
			System.out.println();
		}
	}
}
