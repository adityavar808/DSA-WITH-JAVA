package Function;

import java.util.Scanner;

public class is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(is_Armstrong_Number(n));
	}

	public static int CountOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static boolean is_Armstrong_Number(int n) {
		int original = n;
		int sum = 0;
		int len_n = CountOfDigits(n);
		while (n != 0) {
			int rem = n % 10;
			sum += Math.pow(rem, len_n);
			n = n / 10;
		}
		if (sum == original) {
			return true;
		} else {
			return false;
		}
	}

}
