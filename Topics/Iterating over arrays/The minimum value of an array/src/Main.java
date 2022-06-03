import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            arr[i] = s;
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}