package Array;

public class Array_swap_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] other = { 11, 12, 13, 14, 15 };
		System.out.println(arr[0] + " " + other[1]);
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[1]);
	}

	public static void Swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
