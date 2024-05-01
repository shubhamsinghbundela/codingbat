public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += str.charAt(i) - 48;
            }
        }
        return sum;
    }

}
