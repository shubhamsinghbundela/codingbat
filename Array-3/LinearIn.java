// linearIn

// Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

// linearIn([1, 2, 4, 6], [2, 4]) → true
// linearIn([1, 2, 4, 6], [2, 3, 4]) → false
// linearIn([1, 2, 4, 4, 6], [2, 4]) → true

public class LinearIn {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 6 };
        int[] nums2 = { 2, 4 };
        System.out.println(linearIn(nums1, nums2));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        for (int i = 0; i < inner.length; i++) {
            boolean flag = false;
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return false;
            }
        }
        return true;
    }
}
