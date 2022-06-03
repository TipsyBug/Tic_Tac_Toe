import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 1; i <= n; i++) {
            String test = scanner.next();
            if ("D".equals(test)) {
                d += 1;
            } else if ("C".equals(test)) {
                c += 1;
            } else if ("B".equals(test)) {
                b += 1;
            } else if ("A".equals(test)) {
                a += 1;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}