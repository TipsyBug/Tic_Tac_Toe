import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int len;
        int s;
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i <= len - 1; i++) {
            s = scanner.nextInt();
            arr[i] = s;
        }
        n = scanner.nextInt();
        for (int ch:arr) {
            if (ch > n) {
                sum += ch;
            }
        }
        System.out.println(sum);
    }
}
