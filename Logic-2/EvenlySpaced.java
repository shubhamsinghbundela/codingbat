// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false

public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int s;
        int m;
        int l;
        if (a <= b && a <= c) {
            s = a;
        } else if (b <= a && b <= c) {
            s = b;
        } else {
            s = c;
        }

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            m = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            m = b;
        } else {
            m = c;
        }

        if (a >= b && a >= c) {
            l = a;
        } else if (b >= a && b >= c) {
            l = b;
        } else {
            l = c;
        }
        int diff1 = m - s;
        int diff2 = l - m;
        if (diff1 == diff2) {
            return true;
        } else {
            return false;
        }
    }

}
