// Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

// wordEnds("abcXY123XYijk", "XY") → "c13i"
// wordEnds("XY123XY", "XY") → "13"
// wordEnds("XY1XY", "XY") → "11"
public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
    }

    public static String wordEnds(String str, String word) {
        String str1 = "";
        if (str.length() == word.length()) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == word.charAt(0) && str.substring(i, i + word.length()).equals(word)) {
                str1 += str.charAt(i + word.length());
                i = i + word.length() - 1;
            } else if (i > 0 && i + word.length() == str.length() && str.charAt(i) == word.charAt(0)
                    && str.substring(i, i + word.length()).equals(word)) {
                str1 += str.charAt(i - 1);
                i = i + word.length() - 1;
            } else if (i > 0 && str.charAt(i) == word.charAt(0) && str.substring(i, i + word.length()).equals(word)) {
                str1 += str.charAt(i - 1);
                str1 += str.charAt(i + word.length());
                i = i + word.length() - 1;
            }
        }
        return str1;
    }

}
