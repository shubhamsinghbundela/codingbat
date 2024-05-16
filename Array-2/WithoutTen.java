// Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

// withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
// withoutTen([10, 2, 10]) → [2, 0, 0]
// withoutTen([1, 99, 10]) → [1, 99, 0]

public class WithoutTen {
    public static void main(String[] args) {
        int[] nums = { 1, 99, 10 };
        int[] arr = withoutTen(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
            }
        }
        int m = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                m++;
                int temp = nums[m];
                nums[m] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

}
