public class Backtracking {
    public static void changeArr(int arr[], int i, int val) { // TC=O(n),SC=O(n)
        // base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // recursive functions
        arr[i] -= 2; // bactracking step as we are going back in the array
    }

    static int c = 0;

    public static void subSTRING(String str, String ans, int i) { // ans=to store substring....i for index indexing
        // base case //substring code

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                System.out.println(c); // TC=O(n*2^n)...in order to calculate 1 subset n time is required
            } else { // and therefore in order to calculte 2^n subset n*2^n
                System.out.println(ans);
                // space complexity is O(n)
            }
            return;
        }
        c++;
        // yes choice
        subSTRING(str, ans + str.charAt(i), i + 1);
        // no choice
        subSTRING(str, ans, i + 1);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
