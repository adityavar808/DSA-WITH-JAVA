public class PermutationString {
    public static void main(String[] args) {
        String ques = "abc";
        PrintPermutation(ques, "");
        System.out.println(CountPermutation(ques, ""));
    }
    public static void PrintPermutation(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            PrintPermutation(s1+s2, ans + ch);
        }    
    }
    public static int CountPermutation(String ques, String ans) {
        if(ques.length() == 0){
            return 1;
        }
        int count = 0;
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            count += CountPermutation(s1+s2, ans + ch);
        }    
        return count;
    }   
}
