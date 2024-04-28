// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
// repeatSeparator("This", "And", 2) → "ThisAndThis"
// repeatSeparator("This", "And", 1) → "This"

public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String str1 = "";
        for (int i = 0; i < count - 1; i++) {

            str1 += word;
            str1 += sep;

        }
        if (count == 0) {
            return "";
        } else {
            str1 += word;
        }

        return str1;
    }

}
