package Function;

import java.util.*;

public class Odd_and_Even_back_in_Delhi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test > 0) {
			int n = sc.nextInt();
			if (check_odd_even(n) == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			test--;
		}
	}

	public static boolean check_odd_even(int n) {
		int sum_odd = 0;
		int sum_even = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				sum_even += rem;
			} else {
				sum_odd += rem;
			}
			n = n / 10;
		}
		if (sum_even % 4 == 0 || sum_odd % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
