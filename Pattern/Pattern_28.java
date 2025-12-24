package Pattern;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int number_i = 1;
		int spaces = n - 1;
		int val_main = 1;
		while(rows <= n) {
			int i = 1;
			while(i <= spaces) {
				System.out.print("  ");
				i++;
				
			}
			int j = 1;
			int val = val_main;
			while(j <= number_i) {
				System.out.print(val + " ");
				if(j <= number_i/2) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			val_main++;
			rows++;
			spaces--;
			number_i += 2;
			System.out.println();
		}
	}

}
