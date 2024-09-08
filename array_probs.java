import java.util.Arrays;

public class array_probs { // PROBLEM 1
    public static boolean repeat(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;
    }

    public static int rotated(int[] numbers, int key) {
        int low = 0, high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == key)
                return mid;

            if (numbers[low] == numbers[mid] && numbers[mid] == numbers[high]) {
                // Handle the case where elements at low, mid, and high are the same.
                // In this case, we can't determine which side is sorted, so we reduce the
                // search space.
                low++;
                high--;
            } else if (numbers[low] <= numbers[mid]) {
                // Left half is sorted.
                if (key >= numbers[low] && key < numbers[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted.
                if (key > numbers[mid] && key <= numbers[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int stocks(int prices[]) { // PROBLEM 3
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static int trapped(int heights[]) { // PROBLEM 4

        int n = heights.length;
        // loop to find the max left height
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heights[i], leftmax[i - 1]);
        }
        // loop to find max right height
        int rightmax[] = new int[n];
        rightmax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heights[i], rightmax[i + 1]);
        }
        // loop
        int trappered = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappered += waterlevel - heights[i];
        }
        return trappered;
    }

    public static void triplet(int[] nums) { // PROBLEM 5
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]
                            && (nums[i] + nums[j] + nums[k] == 0)) {
                        System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                    }
                }
            }
        }
    }

    public static int[] concatenate(int arr1[], int arr2[]) {

        int length1 = arr1.length;
        int length2 = arr2.length;

        // Step 1: Concatenate the arrays
        int[] result = new int[length1 + length2];
        System.arraycopy(arr1, 0, result, 0, length1);
        System.arraycopy(arr2, 0, result, length1, length2);

        // Step 2: Sort the concatenated array
        Arrays.sort(result);

        // Step 3: Remove duplicates
        int j = 0;
        for (int i = 1; i < result.length; i++) {
            if (result[i] != result[j]) {
                j++;
                result[j] = result[i];
            }
        }

        // Step 4: Create an array of the correct size and copy the unique elements
        int[] uniqueResult = Arrays.copyOf(result, j + 1);

        return uniqueResult;
    }

    public static int findMaxSum(int ar[]) {
        int n = ar.length;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = Integer.MAX_VALUE;
                int y = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {
                    if (ar[k] < x) {
                        y = x;
                        x = ar[k];
                    } else if (ar[k] < y) {
                        y = ar[k];
                    }
                }
                int sum = x + y;
                MaxSum = Math.max(MaxSum, sum);
            }
        }
        return MaxSum;
    }

    public static int maxProfit(int arr[]) {
        int maxprofit = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = arr[i] - arr[j];
                if (profit < 0) {
                    profit = 0;
                }
                maxprofit = Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int ar[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(ar));
        ; // Output should be 11
    }
}
