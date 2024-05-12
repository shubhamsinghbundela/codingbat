// either24

// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

// either24([1, 2, 2]) → true
// either24([4, 4, 1]) → true
// either24([4, 4, 1, 2, 2]) → false

public class Either24 {
    public static void main(String[] args) {
        int[] nums = { 2 };
        System.out.println(either24(nums));
    }

    public static boolean either24(int[] nums) {
        int count2 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i] == 2 && nums[i + 1] == 2) {
                count2 += 2;
                i += 1;
            }
            if (i != nums.length - 1 && nums[i] == 4 && nums[i + 1] == 4) {
                count4 += 2;
                i += 1;
            }
        }
        if ((count2 == 0 && count4 == 2) || (count4 == 0 && count2 == 2)) {
            return true;
        } else {
            return false;
        }
    }
}
