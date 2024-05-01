public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    public static int maxBlock(String str) {
        int max = 0;
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (i == str.length() - 1) {
                    if (max < count) {
                        max = count;
                    }
                }
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        return max + 1;
    }

}
