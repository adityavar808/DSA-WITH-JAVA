package Pattern;

public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = 1;
		int number_i = 1;
		int val = 1;
		while (rows <= 2*n-1) {
			int i = 1;
			while (i <= number_i) {
				if(i % 2 == 0) {
					System.out.print("* ");
				}
				else {
					System.out.print(val + " ");					
				}
				i++;
			}
			if(rows < n) {
				number_i += 2;
				val++;
			}
			else {
				number_i -= 2;
				val--;	
			}
			rows++;
			System.out.println();
		}
	}

}
