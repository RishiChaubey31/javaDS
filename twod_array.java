import java.util.*;
/*public static spiral(int matrix[][]){
    int startrow=0;
    int startcol=0;
    int endrow=matrix.length-1;
    int endcol=matrix[0].length-1;

while(startrow <= endrow && startcol<= endcol){
    // top
    for(  int j=startcol;j<=endcol;j++){
        System.out.print(matrix[startrow][j]+" ");
    }
}
} */

public class twod_array {
    public static void largest_smallest(int[][] matrix) { // largest and samllest in matrix
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }

    public static boolean search(int matrix[][], int key) { // search for any elemnt in matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        sc.close();
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largest_smallest(matrix);

    }
}
