package template;

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
