public class GHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
    }

    public static boolean gHappy(String str) {
        boolean flag = true;
        if (str.length() == 1 && str.charAt(0) == 'g') {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i + 1 < str.length() && str.charAt(i) == 'g' && str.charAt(i - 1) != 'g'
                    && str.charAt(i + 1) != 'g') {
                flag = false;
            }
            if (i > 0 && i == str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i - 1) != 'g') {
                flag = false;
            }
        }
        return flag;
    }

}
