package Datatypes_and_Number_System;

import java.util.*;
import java.lang.Math;

public class Inverse_Of_Number {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1;
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += pos * Math.pow(10,rem-1);
            n = n / 10;
            pos++;
        }
        System.out.println(sum);
    }
}