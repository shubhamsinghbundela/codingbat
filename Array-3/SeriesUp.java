// seriesUp

// Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

// seriesUp(3) → [1, 1, 2, 1, 2, 3]
// seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
// seriesUp(2) → [1, 1, 2]

public class SeriesUp {
    public static void main(String[] args) {
        int[] arr = seriesUp(2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] seriesUp(int n) {
        int[] nums = new int[(n * (n + 1)) / 2];
        int n1 = n;
        int i = n - 1;
        int k = 0;
        while (n1 > 0) {
            int count = 1;
            int j = k;
            k += n - i;
            while (j < k) {
                nums[j] = count;
                count++;
                j++;
            }
            i--;
            n1--;
        }
        return nums;
    }
}
