import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean result = true;

        int amount = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        if (weekend && 15 <= amount && amount <= 25 || !weekend && 10 <= amount && amount <= 20) {
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
    }
}