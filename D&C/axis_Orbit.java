public class axis_Orbit {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(CountPalindromic(s));
    }

    public static int CountPalindromic(String s) {
        int oddCount = 0;
        int evenCount = 0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break;
                }
                oddCount++;
            }
        }

        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
                    break;
                }
                evenCount++;
            }
        }
        return oddCount + evenCount;
    }
}
