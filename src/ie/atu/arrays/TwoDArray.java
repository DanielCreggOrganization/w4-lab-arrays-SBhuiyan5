package ie.atu.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, // Row 0
            {4, 5, 6}, // Row 1
            {7, 8, 9}  // Row 2
        };

        // Accessing element at row 1, column 2
        System.out.println("Element at (1,2): " + matrix[1][2]);

        // Modifying element at row 0, column 0
        matrix[0][0] = 10;

        // Displaying the 2D array
        for (int i = 0; i < matrix.length; i++) { // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
