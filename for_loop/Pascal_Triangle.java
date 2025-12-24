package for_loop;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int rows = 0;
		int number_i = 1;
		while(rows < n) {
			int i = 0;
			int val = 1;
			while(i < number_i) {
				System.out.print(val + " ");
				val = ((rows - i) * val) / (i + 1);
				i++;
			}
			rows++;
			number_i++;
			System.out.println();
		}
	}

}
