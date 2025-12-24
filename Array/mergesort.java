package Array;

public class mergesort {

	// Function to merge two halves
	public static void merge(int[] arr, int left, int mid, int right) {
		// Sizes of two subarrays
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data into temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		// Merge temp arrays
		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Recursive function to divide and sort
	public static void sort(int[] arr, int left, int right) {
		if (left >= right) {
			return;			
		}
		int mid = (left + right) / 2;

		// Sort first and second halves
		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		
		// Merge sorted halves
		merge(arr, left, mid, right);
	}

	// Main method to test
	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };

		System.out.println("Original array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
