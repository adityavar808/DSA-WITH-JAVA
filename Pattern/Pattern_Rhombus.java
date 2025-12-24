package Pattern;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int spaces = n - 1;
		int rows = 1;
		int number_i = 1;
		int val = 1;
		while (rows <= 2 * n - 1) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while (j <= number_i) {
				System.out.print(p + " ");
				if(j < number_i/2 +1) {
					p++;
				}
				else {
					p--;
				}
				j++;
			}
			
			//next row prep
			if (rows < n) {
				number_i += 2;
				spaces--;
				val++;
			} else {
				number_i -= 2;
				spaces++;
				val--;
			}
			rows++;
			System.out.println();
		}
	}

}
