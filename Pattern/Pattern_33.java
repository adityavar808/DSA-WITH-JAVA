package Pattern;

public class Pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int number_i = 1;
		int val = n;
		int rows = 1;
		int spaces = n - 1;
		while (rows <= n) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int val_main = val;
			while (j <= number_i) {
				int val_main_2 = val_main;
				if (j == number_i / 2 + 1) {
					System.out.print("0 ");
				} 
				else if(j >= number_i / 2 + 1) {
					if(val_main_2 > n-1) {
						val_main_2 = n-1;
						val_main--;
					}
					System.out.print(val_main_2 + " ");
					val_main--;
				}
				else {
					System.out.print(val_main_2 + " ");
					val_main++;
				}
				if (rows <= number_i / 2 + 1) {
					val_main_2--;
				} else {
					val_main_2++;
				}
				j++;
			}
			val--;
			number_i += 2;
			spaces--;
			rows++;
			System.out.println();
		}
	}
}