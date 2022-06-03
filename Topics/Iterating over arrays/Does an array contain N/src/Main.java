import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        int d;
        int s;
        len = scanner.nextInt();
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            d = scanner.nextInt();
            arr[i] = d;
        }
        s = scanner.nextInt();
        boolean res = false;
        for (int ch:
             arr) {
            if (s == ch) {
                res = !res;
            }
        }
        System.out.println(res);
    }
}