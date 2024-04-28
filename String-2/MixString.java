// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
    }

    public static String mixString(String a, String b) {
        int aCount = a.length();
        int bCount = b.length();
        String small;
        String big;
        if (aCount < bCount) {
            small = a;
            big = b;
        } else {
            big = a;
            small = b;
        }
        String str = "";
        for (int i = 0; i < small.length(); i++) {
            str += a.charAt(i);
            str += b.charAt(i);
        }
        str += big.substring(small.length());
        return str;
    }

}
