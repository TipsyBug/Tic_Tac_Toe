import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        int sum = 0;
        while (start) {
            int s = scanner.nextInt();
            if (s == 0) {
                start = !start;
            } else {
                sum += s;
            }
        }
        System.out.println(sum);
    }
}