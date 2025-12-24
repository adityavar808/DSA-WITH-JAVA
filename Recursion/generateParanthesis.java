import java.util.*;

public class generateParanthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> ll = new ArrayList<>();
        generate_Paranthesis(n, 0, 0, "", ll);
        System.out.println(ll);
    }
    // public static void generate_Paranthesis(int n, int open, int close, String ans){
    //     if(open == n && close == n){
    //         System.out.println(ans + " ");
    //     }
    //     if(open < n){
    //         generate_Paranthesis(n, open + 1, close, ans + "(");
    //     }
    //     if(close < open){
    //         generate_Paranthesis(n, open, close + 1, ans + ")");
    //     }
    // }
    public static void generate_Paranthesis(int n, int open, int close, String ans, List<String> ll){
        if(open == n && close == n){
            // System.out.println(ans + " ");
            ll.add(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }
        generate_Paranthesis(n, open + 1, close, ans + "(", ll);
        generate_Paranthesis(n, open, close + 1, ans + ")", ll);
    }
}
