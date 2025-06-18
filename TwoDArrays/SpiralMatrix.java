package TwoDArrays;

public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int startRow = 0, endRow = n - 1, startCol = 0, endCol = m - 1;

        while (startCol <= endCol && startRow <= endRow) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // bottom (only if there are remaining rows)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // left (only if there are remaining columns)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }

        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiralMatrix(matrix);
    }
}
