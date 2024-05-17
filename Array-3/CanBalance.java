// canBalance

// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([10, 10]) → true

public class CanBalance {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 4 };
        System.out.println(canBalance(nums));
    }

    public static boolean canBalance(int[] nums) {
        int m = nums.length - 1;

        while (m >= 0) {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i <= m; i++) {
                sum1 += nums[i];
            }
            for (int i = m + 1; i < nums.length; i++) {
                sum2 += nums[i];
            }
            if (sum1 == sum2) {
                return true;
            } else {
                m--;
            }
        }
        return false;
    }
}
