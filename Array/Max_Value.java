package Array;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 4, 9, 6, 2 };
		System.out.println(Max_Value_fun(arr));
	}

	public static int Max_Value_fun(int[] arr) {
		int a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}
		}
		return a;
	}

	public static int Max_Value_fun_II(int[] arr) {
		int a = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}
		}
		return a;
	}

	public static int Max_Value_fun_III(int[] arr) {
		int a = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			a = Math.max(a, arr[i]);
		}
		return a;
	}

}
