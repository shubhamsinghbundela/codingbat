// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

// endOther("Hiabc", "abc") → true
// endOther("AbC", "HiaBc") → true
// endOther("abc", "abXabc") → true

public class EndOther {
    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String str;
        String str1;
        if (a1.length() < b1.length()) {
            str = a1;
            str1 = b1;
        } else {
            str = b1;
            str1 = a1;
        }
        int count = str1.length() - str.length();
        if (str1.substring(count).equals(str)) {
            return true;
        }
        return false;
    }

}
