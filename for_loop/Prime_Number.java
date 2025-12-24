package for_loop;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= num - 1; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("This is a Prime Number.");
		}
		else {
			System.out.println("This is Not a Prime Number.");
		}
	}

}
