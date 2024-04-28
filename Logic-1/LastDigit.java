// Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

// lastDigit(23, 19, 13) → true
// lastDigit(23, 19, 12) → false
// lastDigit(23, 19, 3) → true

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 3));
    }

    public static boolean lastDigit(int a, int b, int c) {
        int n1 = a % 10;
        int n2 = b % 10;
        int n3 = c % 10;
        if (n1 == n2 || n2 == n3 || n3 == n1) {
            return true;
        } else {
            return false;
        }
    }

}
