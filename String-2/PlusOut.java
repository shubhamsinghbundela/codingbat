// Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

// plusOut("12xy34", "xy") → "++xy++"
// plusOut("12xy34", "1") → "1+++++"
// plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "1"));
    }

    public static String plusOut(String str, String word) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.substring(i, i + word.length()).equals(word)) {
                // System.out.println(i);
                str2 += word;
                i = i + word.length() - 1;
            } else {
                str2 += "+";
            }
        }
        return str2;

    }

}
