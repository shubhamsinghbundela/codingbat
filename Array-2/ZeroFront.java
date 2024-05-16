// zeroFront

// Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

// zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
// zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
// zeroFront([1, 0]) → [0, 1]

public class ZeroFront {
    public static void main(String[] args) {
        int[] nums = { 1, 0 };
        int[] arr = zeroFront(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] zeroFront(int[] nums) {
        int m = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                m++;
                int temp = nums[m];
                nums[m] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
