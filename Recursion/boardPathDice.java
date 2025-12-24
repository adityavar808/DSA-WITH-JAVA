public class boardPathDice {
    public static void main(String[] args) {
        int n = 5;
        Pritans(n, 0, "");
    }
    public static void Pritans(int n, int curr, String ans){
        if(curr == n){
            System.out.println(ans + " ");
            return;
        }
        if(curr > n){
            return;
        }

        for(int dice = 1; dice <= 3; dice++){
            Pritans(n, curr + dice, ans + dice);
        }
        
        // Pritans(n, curr + 1, ans + 1);
        // Pritans(n, curr + 2, ans + 2);
        // Pritans(n, curr + 3, ans + 3);
    }
}
