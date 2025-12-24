package ArrayList;

public class Circular_Array_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -8, -9, 10, 3, -4, -5, 15 };
		System.out.println(MaximumSum(arr));
	}

	public static int MaximumSum(int[] arr) {
		int linear_sum = KadensAlgo(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid = KadensAlgo(arr);
		int CircularSum = sum + mid; // circular sum
		if (CircularSum == 0) {
			return linear_sum;
		}
		return Math.max(linear_sum, CircularSum);
	}

	public static int KadensAlgo(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}