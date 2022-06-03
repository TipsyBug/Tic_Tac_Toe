import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 1;
        List<Integer> max = new ArrayList<>();
        for (int j = 0; j < size - 1; j++) {
            if (array[j] < array[j + 1]) {
                count++;
            } else {
                max.add(count);
                count = 1;
            }
        }
        max.add(count);
        System.out.println(Collections.max(max));
    }
}