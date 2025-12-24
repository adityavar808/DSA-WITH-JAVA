package Pattern;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int stars = n;
		
		int i = 1;
		while(i <= stars) {
			System.out.print("* ");
			i++;
		}
		
		System.out.println();
		
		rows = 1;
		int spaces = n-2;
		while(rows <= n-2) { // rows
			System.out.print("* ");
			int j = 1;
			while(j <= spaces) {
				System.out.print("  ");
				j++;
			}
			rows++;
			System.out.print("* ");
			System.out.println();
		}
		
		int k = 1;
		while(k <= stars) {
			System.out.print("* ");
			k++;
		}
		System.out.println();
	}		
}