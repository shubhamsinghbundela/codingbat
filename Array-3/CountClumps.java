// Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

// countClumps([1, 2, 2, 3, 4, 4]) → 2
// countClumps([1, 1, 2, 1, 1]) → 2
// countClumps([1, 1, 1, 1, 1]) → 1

public class CountClumps {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 };
        System.out.println(countClumps(nums));
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            flag = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    flag = true;
                    i += 1;
                    continue;
                } else {
                    if (flag == true) {
                        count++;
                    }
                    break;
                }
            }
        }
        if (flag == false) {
            return 0;
        } else {
            return count;
        }

    }

}
