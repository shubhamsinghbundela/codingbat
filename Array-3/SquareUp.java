// squareUp

// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

// squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
// squareUp(2) → [0, 1, 2, 1]
// squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

public class SquareUp {
    public static void main(String[] args) {
        int[] arr = squareUp(3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] squareUp(int n) {
        int n1 = n;

        int[] nums = new int[n * n];
        if (n == 1) {
            nums[0] = 1;
        }
        int i = nums.length - 1;
        while (i > 0) {
            int count = 1;
            for (int j = i; j > i - n1; j--) {
                nums[j] = count;
                count++;
            }
            i -= n;
            n1--;
        }
        return nums;
    }

}
