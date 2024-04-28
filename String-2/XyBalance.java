// We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

// xyBalance("aaxbby") → true
// xyBalance("aaxbb") → false
// xyBalance("yaaxbb") → false

public class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
    }

    public static boolean xyBalance(String str) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'x') {
                count++;
                flag = true;
            }
            if (count >= 1 && ch == 'y') {
                count = 0;
            }
        }
        if (flag == true && count == 0) {
            return true;
        } else if (flag == false) {
            return true;
        } else {
            return false;
        }
    }

}
