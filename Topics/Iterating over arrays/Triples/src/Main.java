import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = scanner.nextInt();
        }
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i - 1] == 1 && arr[i + 1] - arr[i] == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}