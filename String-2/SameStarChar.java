// Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

// sameStarChar("xy*yzz") → true
// sameStarChar("xy*zzz") → false
// sameStarChar("*xa*az") → true

public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*zzz"));
    }

    public static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && i == 0) {
                continue;
            }
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
