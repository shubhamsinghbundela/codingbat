// zeroMax

// Return a version of the given array where each zero value in the array is
// replaced by the largest odd value to the right of the zero in the array. If
// there is no odd value to the right of the zero, leave the zero as a zero.

// zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
// zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
// zeroMax([0, 1, 0]) → [1, 1, 0]

public class ZeroMax {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0 };
        int[] arr = zeroMax(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] zeroMax(int[] nums) {
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                if (max % 2 == 1) {
                    nums[i] = max;
                }
            } else {
                if (nums[i] % 2 == 1 && max < nums[i]) {
                    max = nums[i];
                }
            }

        }
        return nums;
    }
}