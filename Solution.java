import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50 }; // Example scores

        String[] result = findRanks(scores);

        for (String rank : result) {
            System.out.println(rank); // Print the result
        }
    }

    public static String[] findRanks(int[] scores) {
        int n = scores.length;

        // Sort the scores array in descending order
        Arrays.sort(scores);
        // Reverse the array to get scores in descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = scores[i];
            scores[i] = scores[n - i - 1];
            scores[n - i - 1] = temp;
        }

        // Create a result array to store ranks
        String[] result = new String[n];

        // Assign ranks based on the sorted array
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = "Gold Medal";
            } else if (i == 1) {
                result[i] = "Silver Medal";
            } else if (i == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}
