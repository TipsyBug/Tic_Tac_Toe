import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int dig;
        do {
            dig = scanner.nextInt();
            if (max < dig) {
                max = dig;
            }
        } while (dig != 0);
        System.out.println(max);
    }
}