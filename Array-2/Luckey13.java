
// Given an array of ints, return true if the array contains no 1's and no 3's.

// lucky13([0, 2, 4]) → true
// lucky13([1, 2, 3]) → false
// lucky13([1, 2, 4]) → false

public class Luckey13 {
    public static void main(String[] args) {
        int[] arr1 = { 0, 2, 4 }; // true

        int[] arr2 = { 1, 2, 3 }; // false
        int[] arr3 = { 1, 2, 4 }; // false
        int[] arr4 = { 2, 7, 2, 8 }; // true
        int[] arr5 = { 2, 7, 1, 8 }; // false
        int[] arr6 = { 3, 7, 2, 8 }; // false
        int[] arr7 = { 2, 7, 2, 1 }; // false
        int[] arr8 = { 1, 2 }; // false
        int[] arr9 = { 2, 2 }; // true
        System.out.println(lucky13(arr4));
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
