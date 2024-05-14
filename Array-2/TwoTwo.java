// twoTwo

// Given an array of ints, return true if every 2 that appears in the array is next to another 2.

// twoTwo([4, 2, 2, 3]) → true
// twoTwo([2, 2, 4]) → true
// twoTwo([2, 2, 4, 2]) → false

public class TwoTwo {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 5, 2 };
        System.out.println(twoTwo(nums));
    }

    public static boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[nums.length - 1] == 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                i += 1;
            } else if (nums[i] == 2 && nums[i + 1] != 2) {
                return false;
            } else if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) {
                return false;
            }
        }
        return true;
    }
}