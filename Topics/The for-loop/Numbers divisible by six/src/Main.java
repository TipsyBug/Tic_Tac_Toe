import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int p = 6;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int e = scanner.nextInt();
            if (e % p == 0) {
                sum += e;
            }
        }
        System.out.println(sum);
    }
}
