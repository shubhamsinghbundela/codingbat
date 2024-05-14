// tenRun

// For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

// tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
// tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
// tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

public class TenRun {
    public static void main(String[] args) {
        int[] nums = { 10, 1, 9, 20 };
        int[] arr = tenRun(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] tenRun(int[] nums) {
        int num = 1111;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                num = nums[i];
            }
            if (num != 1111) {
                nums[i] = num;
            }
        }
        return nums;
    }

}
