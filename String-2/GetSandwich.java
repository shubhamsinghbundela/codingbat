// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

// getSandwich("breadjambread") → "jam"
// getSandwich("xxbreadjambreadyy") → "jam"
// getSandwich("xxbreadyy") → ""

public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadjambreadyy"));
    }

    public static String getSandwich(String str) {
        int count1 = 0;
        int count2 = 0;
        if (str.length() < 11) {
            return "";
        }
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                count1 = i + 5;
                break;
            }
        }
        for (int i = count1; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                count2 = i;
            }
        }
        return str.substring(count1, count2);
    }

}
