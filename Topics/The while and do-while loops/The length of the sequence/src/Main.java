import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int count;
        do {
            count = scanner.nextInt();
            i++;
        } while (count != 0);
        System.out.println(i - 1);
    }
}