import java.util.*;

public class twod_array {
    public static boolean search(int[][] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == k) {
                    System.out.println("element found at " + i + " " + j);
                    return true;
                }

            }

        }
        return false;
    }

    public static void Spiral(int[][] matrix) {
        int StartRow = 0;
        int EndRow = matrix.length - 1;
        int StartColumn = 0;
        int EndColumn = matrix[0].length - 1;
        while (StartRow <= EndRow && StartColumn <= EndColumn) {

            for (int j = StartColumn; j <= EndColumn; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndColumn] + " ");
            }
            for (int j = EndColumn - 1; j >= StartColumn; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartColumn == EndColumn) {
                    break;
                }
                System.out.print(matrix[i][StartColumn] + " ");
            }
            StartColumn++;
            StartRow++;
            EndColumn--;
            EndRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Spiral(matrix);
    }

    // public static void main(String[] args) {
    // int nums[][] = new int[3][3];
    // int n = nums.length, m = nums[0].length;
    // Scanner sc = new Scanner(System.in);

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // nums[i][j] = sc.nextInt();

    // }
    // }
    // sc.close();
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(nums[i][j] + " ");

    // }
    // System.out.println();
    // }

    // int k = 7;
    // System.out.println(search(nums, k));

    // }
}
