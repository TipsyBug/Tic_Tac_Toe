import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int len;
        int dig;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        len = s.nextInt();
        for (int i = 1; i <= len; i++) {
            dig = s.nextInt();
            sum = sum + dig;
        }
        System.out.println(sum);
    }
}