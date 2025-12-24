package Pattern;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int rows = 1;
		int spaces = n/2;
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
			if(rows <= n/2) {
				stars += 2;
				spaces--;
			}
			else {
				stars -= 2;
				spaces++;
			}
			rows++;
			System.out.println();
		}
	}

}
