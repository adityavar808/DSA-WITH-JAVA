public class coinTossWithout2H {
    public static void main(String[] args) {
        int n = 3;
        coinTossWithout2Hcont(n, "");
    }
    public static void coinTossWithout2Hcont(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){
            coinTossWithout2Hcont(n - 1, ans + "H");
        }
        coinTossWithout2Hcont(n - 1, ans + "T");
    }
    
}
