
// Given a string, return a string where for every char in the original, there are two chars.

// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("HHii--TThheerree"));
    }

    static String doubleChar(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str1 += ch;
            str1 += ch;
        }
        return str1;
    }

}
