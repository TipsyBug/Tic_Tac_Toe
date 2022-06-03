import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        outputMatrix(rotateMatrix(m, n, matrix));
    }

    public static int[][] rotateMatrix(int m, int n, int[][] matrix) {
        int[][] rotated = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][i] = matrix[m - i - 1][j];
            }
        }
        return rotated;
    }

    public static void outputMatrix(int[][] matrix) {
        System.out.println();
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.print(" " + el);
            }
            System.out.println();
        }
    }
}
