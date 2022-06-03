import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        int dig;
        int n;
        int res = 0;
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            dig = scanner.nextInt();
            arr[i] = dig;
        }
        n = scanner.nextInt();
        for (int ch:
             arr) {
            if (n == ch) {
                res++;
            }
        }
        System.out.println(res);
    }
}
