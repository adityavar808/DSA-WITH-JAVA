package Datatypes_and_Number_System;

public class dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			n = n / 2;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}
