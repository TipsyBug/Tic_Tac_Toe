import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digit = scanner.next();
        if (digit.charAt(0) == digit.charAt(3) && digit.charAt(1) == digit.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println("24");
        }
    }
}