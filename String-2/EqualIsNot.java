// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true

public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static boolean equalIsNot(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == 'i' && str.substring(i, i + 2).equals("is")) {
                count1++;
                i = i + 1;
            } else if (i + 2 < str.length() && str.charAt(i) == 'n' && str.substring(i, i + 3).equals("not")) {
                count2++;
                i = i + 2;
            }
        }
        if (count1 == count2) {
            return true;
        } else {
            return false;
        }
    }

}
