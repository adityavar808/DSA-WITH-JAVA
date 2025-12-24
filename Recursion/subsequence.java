public class subsequence {
    public static void main(String[] args) {
        String ques = "abc";
        printSubSeq(ques, "");
        System.out.println(CountSubSeq(ques, ""));
        // System.out.println(count);
    }

    // static int count = 0;

    public static void printSubSeq(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            // count++;
            return;
        }

        char ch = ques.charAt(0);
        printSubSeq(ques.substring(1), ans);
        printSubSeq(ques.substring(1), ans + ch);
    }

    public static int CountSubSeq(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        int a1 = CountSubSeq(ques.substring(1), ans);
        int a2 = CountSubSeq(ques.substring(1), ans + ch);
        return a1 + a2;
    }
}