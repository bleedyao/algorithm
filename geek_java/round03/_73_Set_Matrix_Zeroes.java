package round03;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class _73_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        printMatrix(matrix);
        setZeroes(matrix);
        printMatrix(matrix);

        matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        printMatrix(matrix);
        setZeroes(matrix);
        printMatrix(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix[0] == null) {
            return;
        }
        boolean flagCol0 = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                flagCol0 = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (flagCol0) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        for (int[] arr : matrix) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<");
    }
}
