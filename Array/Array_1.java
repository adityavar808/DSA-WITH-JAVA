package Array;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(i + "\t  ->  \t" + arr[i]);
		}
	}

}
