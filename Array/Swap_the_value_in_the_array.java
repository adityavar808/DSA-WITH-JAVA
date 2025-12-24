package Array;

public class Swap_the_value_in_the_array {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
