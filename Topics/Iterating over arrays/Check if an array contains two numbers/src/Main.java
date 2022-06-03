import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int size;
        int n;
        int m;
        boolean order = false;

        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();
        int[] charakter = new int[size];

        for (int i = 0; i < size; i++) {
            charakter[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            if (charakter[i - 1] == n && charakter[i] == m || charakter[i - 1] == m && charakter[i] == n) {
                order = !order;
            }
        }
        System.out.println(order);
    }
}
