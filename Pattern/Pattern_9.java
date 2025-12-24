package Pattern;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = 1;
		int rows = 1;
		int spaces = n-1;
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
			stars += 2;
			spaces--;
			System.out.println();
		}
	}

}
