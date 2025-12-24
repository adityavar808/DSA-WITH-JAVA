package maximumSubarraySlidingWindow;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(Product_less_than_k(arr, k));
	}

	public static int Product_less_than_k(int[] arr, int k) {
		int start = 0;
		int end = 0;
		int product = 1;
		int ans = 0;
		while (end < arr.length) {
			product = product * arr[end];
			while(product >= k && start <= end) {
				product=product/arr[start];
				start++;
			}
			ans = ans + (end- start + 1);
			end++;
		}
		return ans;
	}

}
