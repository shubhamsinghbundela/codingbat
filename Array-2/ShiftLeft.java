// shiftLeft

// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

// shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
// shiftLeft([1, 2]) → [2, 1]
// shiftLeft([1]) → [1]

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int[] arr = shiftLeft(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] shiftLeft(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }

}
