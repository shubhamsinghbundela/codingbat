// Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

// teenSum(3, 4) → 7
// teenSum(10, 13) → 19
// teenSum(13, 2) → 19

public class TeenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(13, 2));
    }

    public static int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return sum;
        }
    }

}
