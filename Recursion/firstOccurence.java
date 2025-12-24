public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,1};
        int target = 3;
        System.out.println(firstOccurenceSearch(arr, target, 0));
    }
    public static int firstOccurenceSearch(int[] arr, int target, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }

        return firstOccurenceSearch(arr, target, idx + 1);
    }
}
