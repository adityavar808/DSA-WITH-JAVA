import java.util.*;

public class Palindrone_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new java.util.ArrayList<>();
        List<List<String>> ll2d = new java.util.ArrayList<>();
        Partition(ques, ll, ll2d);
        System.out.println(ll2d);

    }

    public static void Partition(String ques, List<String> ll, List<List<String>> ll2d) {
        if (ques.length() == 0) {
            // System.out.println(ll);
            ll2d.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s)) {
                ll.add(s);
                Partition(ques.substring(i), ll, ll2d);
                ll.remove(ll.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}