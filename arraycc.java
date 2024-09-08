
/*public class arraycc {
    public static void update(int marks[]) {
for(int i=0;i<marks.length;i++){
marks[i]+=1;
}
    }
        
    
    public static void main(String[] args) {
        int marks[]={100,100,100};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
        }
       
} */

public class arraycc { // linear search
    public static int linearSearch(String item[], String maal) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == maal) {
                return i;
            }
        }
        return -1;
    }

    public static int greatest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // stores -infinty number
        int smallest = Integer.MAX_VALUE; // stores +infiniy number
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        return smallest;

    }

    public static int binarysearch(int numbers[], int key) { // binay search
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) { // right numbers
                start = mid + 1;
            } else { // left numbers
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last]; // swapping decereases space complexcity , rather than considering another array
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void pairs(int numbers[]) { // pairs of arrays
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs=" + tp);
    }

    public static void subarrays(int numbers[]) { // subarrays time complexity O(n^3)
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");

                }

                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("total number of subarrays= " + ts);

    }

    public static void maxsubarraysum(int numbers[]) { // maximum of the subarray sum(brute force)
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];

                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }

        }

        System.out.println("max sum= " + maxsum);

    }

    public static void maxsubarraysum_prefix_method(int numbers[]) { // using prefix method max sum of subarrays
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }

        }

        System.out.println("max sum= " + maxsum);

    }

    public static int maxsumnew(int arr[]) {

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;

    }

    public static void kadanes(int[] numbers) { // kadanes algorithm max sum of subarray
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {

                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("our maximum sub array  sum is= " + ms);

    }

    public static int trapped_water_problem(int[] height) { // trapped rainwater problem
        int n = height.length;
        // calculate left maximum boundary-auxilary array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right maximum boundary-auxilary array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // loop for calculation of trapped water
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];

        }
        return trappedwater;
    }

    public static int STOCKS(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    // FROM HERE THE SORTING ALGORITHM STARTS//

    public static void bubble(int arr[]) { // bubble sorting algorithm
        int n = arr.length;
        boolean swap;
        for (int turn = 0; turn < n - 1; turn++) {
            swap = false;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void printarr(String arr[]) { // printing an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selection_sort(int[] nums) { // SELECTION SORT ALGORITHM
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minpos] > nums[j]) { // CHANGING TTHE SIGN MAKES THE ARRAY IN DECENDING ORDER
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]) { // INSERTION SORT ALGORITHM
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            // finding out the correct positon to insert
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = cur;
        }
    }

    public static void couning_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void MergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // mid calculation
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = 0; // index for 1st sorted part (left)
        int j = mid + 1; // index for 2nd sorted part(right)
        int k = 0; // index for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover parts of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover parts of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying the sorted arrat to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void QuickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        QuickSort(arr, si, pIdx - 1);
        QuickSort(arr, pIdx, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for smallr elemnt assign i=-1
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void subSTRing(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }

                System.out.println();
            }
            System.out.println();
        }

    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            for (int end = start; end < n; end++) {
                currentSum += arr[end];

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }

    public static int LongestConsecutive(int nums[]) {
        int maxL = 0;
        for (int i = 0; i < nums.length; i++) {
            int l = nums[i] + 1;
            int c = 1;
            for (int j = 0; j < nums.length; j++) {
                if (l == nums[j]) {
                    c += 1;
                    l += 1;
                    j = -1;

                }
            }

            maxL = Math.max(c, maxL);
        }
        return maxL;
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;

        int c = 0;
        for (int i = 0; i < n; i++) {

            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                int sum = 0;
                for (int l = start; l <= end; l++) {
                    // System.out.println(nums[l]);
                    sum = sum + nums[l];
                }
                if (sum == k) {
                    c += 1;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }

}