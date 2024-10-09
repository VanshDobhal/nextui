// package Array_programs;

import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
