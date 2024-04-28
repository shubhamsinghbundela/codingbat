public class WithoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("xxx", "xx"));
    }

    public static String withoutString(String base, String remove) {
        String base1 = base.toLowerCase();
        String remove1 = remove.toLowerCase();
        String str = "";
        for (int i = 0; i < base.length(); i++) {
            if (i + remove1.length() <= base.length() && base1.charAt(i) == remove1.charAt(0)
                    && base1.substring(i, i + remove1.length()).equals(remove1)) {
                i += remove.length() - 1;
            } else {
                str += base.charAt(i);
            }
        }
        return str;
    }

}
