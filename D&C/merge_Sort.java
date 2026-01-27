public class merge_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 4, 3 };
        int[] merge_Sort_array = Sort(arr, 0, arr.length - 1);
        for (int i = 0; i < merge_Sort_array.length; i++) {
            System.out.print(merge_Sort_array[i] + " ");
        }
    }

    public static int[] Sort(int[] arr, int si, int ei) {
        if(si == ei){
            int[] base = new int[1];
            base[0] = arr[si];
            return base;
        }
        int mid = (si + ei) / 2;
        int[] fa = Sort(arr, si, mid);
        int[] sa = Sort(arr, mid + 1, ei);
        return Merge_Two_Array(fa, sa);
    }

    public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
