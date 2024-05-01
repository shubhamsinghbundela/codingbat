public class SameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("xx"));
    }

    public static String sameEnds(String string) {
        int len = string.length() / 2;
        for (int i = len - 1; i >= 0; i--) {
            String str = string.substring(0, i + 1);
            for (int j = len; j < string.length(); j++) {
                if (str.charAt(0) == string.charAt(j) && str.equals(string.substring(j))) {
                    return string.substring(j);
                }
            }
        }
        return "";
    }

}
