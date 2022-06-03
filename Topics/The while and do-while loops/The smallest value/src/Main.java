import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long i = 1;
        long fact = 1;
        do {
            fact = fact * i;
            i++;
        } while (fact <= n);
        System.out.println(i - 1);
    }
}