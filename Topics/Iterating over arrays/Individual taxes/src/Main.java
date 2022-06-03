import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        double[] income = new double[n];
        double[] taxes = new double[n];
        double[] taxSum = new double[n];
        for (int i = 0; i < n; i++) {
            income[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            taxSum[i] = income[i] * taxes[i];
        }
        int num = -1;
        double maxTax = 0;
        for (int i = 0; i < n; i++) {
            if (n == 0) {
                num = i;
            } else if (maxTax < taxSum[i]) {
                maxTax = taxSum[i];
                num = i;
            }
        }
        System.out.println(num + 1);
    }
}