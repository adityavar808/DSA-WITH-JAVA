package Pattern;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int stars = (n*2) - 1;
		int rows = 1;
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
			System.out.println();
			stars -= 2;
			spaces++;
			rows++;
		}
	}

}
