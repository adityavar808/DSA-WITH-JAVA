package Pattern;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int stars = n;
		while(rows <= n) {
			int i = 1;
			while(i <= stars) {
				System.out.print("* ");
				i++;
			}
			stars--;
			rows++;
			System.out.println();
		}
	}

}
