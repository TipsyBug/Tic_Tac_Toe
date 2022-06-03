import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (d < 1) {
            System.out.println("no army");
        } else if (d >= 1 && d <= 19) {
            System.out.println("pack");
        } else if (d >= 20 && d <=249) {
            System.out.println("throng");
        } else if (d >= 250 && d <=999) {
            System.out.println("zounds");
        } else if (d >= 1000) {
            System.out.println("legion");
        }
    }
}