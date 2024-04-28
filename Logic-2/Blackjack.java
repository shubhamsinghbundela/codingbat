// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

// blackjack(19, 21) → 21
// blackjack(21, 19) → 21
// blackjack(19, 22) → 19

public class Blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
    }

    public static int blackjack(int a, int b) {
        int a1;
        int b1;
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a <= 21) {
            a1 = 21 - a;
        } else {
            return b;
        }

        if (b <= 21) {
            b1 = 21 - b;
        } else {
            return a;
        }

        if (a1 == b1) {
            return 0;
        } else if (a1 < b1) {
            return a;
        } else {
            return b;
        }

    }

}
