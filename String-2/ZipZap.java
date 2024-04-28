
// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

// zipZap("zipXzap") → "zpXzp"
// zipZap("zopzop") → "zpzp"
// zipZap("zzzopzop") → "zzzpzp"

public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }

    public static String zipZap(String str) {
        String str1 = "";
        if (str.length() < 3) {
            return str;
        }
        boolean flag = true;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str1 += str.charAt(i);
                str1 += str.charAt(i + 2);
                flag = false;
                i += 2;
            } else {
                str1 += str.charAt(i);
            }
        }
        if (flag == true) {
            return str;
        } else {
            return str1;
        }
    }

}
