package sorting;

public class insertLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 6, 5, 4, 3, 8, 2 };
		InsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}
	}

	public static void InsertLastElement(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;
		while (arr[j] > item) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = item;

	}
}
