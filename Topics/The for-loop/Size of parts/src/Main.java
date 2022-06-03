import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int large = 0, smaller = 0, perfect = 0;
        for (int i = 1; i <= n; i++) {
            int d = scanner.nextInt();
            if (d == 1) {
                large += 1;
            } else if (d == -1) {
                smaller += 1;
            } else if (d == 0) {
                perfect += 1;
            }
        }
        System.out.println(perfect + " " + large + " " + smaller);
    }
}