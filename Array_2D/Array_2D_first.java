package Array_2D;

import java.util.Scanner;

public class Array_2D_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		int[][] other_arr = arr;
		
		System.out.println(arr.length * arr[0].length);
		arr[1][3] = 4;
		System.out.println(arr[1][3]);
		other_arr[1][3] = 10;
		System.out.println(other_arr[1][3]);
		System.out.println(arr[1][3]);
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
