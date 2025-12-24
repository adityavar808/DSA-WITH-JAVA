package Pattern;

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int rows = 1;
		int space_1 = n / 2;
		int space_2 = -1;
		int star = 1;
		while (rows <= n) {
			int i = 1;
			while (i <= space_1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			int k = 1;
			while(k <= space_2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			if(rows == 1 || rows == n) {
				l = 2;
			}
			while(l <= star) {
				System.out.print("* ");
				l++;
			}
			if(rows <= n/2) {
				space_1--;
				space_2 += 2;
			}
			else {
				space_1++;
				space_2 -= 2;
			}
			System.out.println();
			rows++;
		}
	}

}
