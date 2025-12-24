package Pattern;

public class Pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int number_i = n;
		int val = n;
		while (rows <= n) {
			int i = 1;
			while (i <= number_i) {
				if (rows != val) {
					System.out.print(val + " ");					
				}
				else {
					System.out.print("* ");					
				}
				i++;
				val--;
			}
			rows++;
			val = n;
			System.out.println();
		}
	}

}
