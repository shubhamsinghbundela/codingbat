
public class TwoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        int n1 = a + b;
        int n2 = b + c;
        int n3 = c + a;
        if (n1 == c || n2 == a || n3 == b) {
            return true;
        } else {
            return false;
        }
    }

}
