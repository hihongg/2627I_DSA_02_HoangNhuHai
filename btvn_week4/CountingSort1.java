package btvn_week4;
import java.util.*;

public class CountingSort1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextInt()) return;
        int n = scan.nextInt();

        int[] frequen = new int[100];

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            frequen[num]++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(frequen[i] + (i == 99 ? "" : " "));
        }
    }
}
