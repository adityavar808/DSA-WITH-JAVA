package Datatypes_and_Number_System;

import java.util.*;
public class Farhenheit_Conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int min_value = sc.nextInt();
		int max_value = sc.nextInt();
		int step = sc.nextInt();

		for(int i = min_value; i <= max_value; i += step){
			int cel = (int) ((5/9.0) * (i - 32));
			System.out.print(i + " ");
			System.out.println(cel);
		}
    }
}
