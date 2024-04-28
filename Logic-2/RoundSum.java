// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

// roundSum(16, 17, 18) → 60
// roundSum(12, 13, 14) → 30
// roundSum(6, 4, 4) → 10

public class RoundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(6, 4, 4));
    }

    public static int roundSum(int a, int b, int c) {
        int sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    public static int round10(int num) {
        int rightDigit = num % 10;
        if (rightDigit >= 5) {
            num = num + 10 - rightDigit;
        } else {
            num -= rightDigit;
        }
        return num;
    }

}
