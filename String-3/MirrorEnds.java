public class MirrorEnds {
    public static void main(String[] args) {

        System.out.println(mirrorEnds("abca"));
    }

    public static String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1))
                result += string.charAt(i);
            else
                break;
        }

        return result;
    }

}
