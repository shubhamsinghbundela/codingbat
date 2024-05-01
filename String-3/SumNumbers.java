public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                str1 += str.charAt(i);
            } else {
                if (str1.length() > 0) {
                    sum += Integer.parseInt(str1);
                }
                str1 = "";
            }
        }
        if (str1.length() > 0) {
            sum += Integer.parseInt(str1);
        }
        return sum;
    }

}
