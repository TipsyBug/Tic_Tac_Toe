import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        int m;
        int max = Integer.MIN_VALUE;
        int mn = 0;
        int mm = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    mn = i;
                    mm = j;
                }
            }
        }
        System.out.println(mn + " " + mm);
    }
}