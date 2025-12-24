public class factorial_head {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = factorial(n - 1);
        return fn * n;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
