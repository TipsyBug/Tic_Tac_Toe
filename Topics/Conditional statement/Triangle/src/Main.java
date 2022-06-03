import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (
            a + b > c && a + c > b && b + c > a
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
