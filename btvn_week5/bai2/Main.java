package btvn_week5.bai2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 50000};
        Random rand = new Random();

        for (int n : sizes) {
            // Tạo mảng ngẫu nhiên
            int[] arr1 = rand.ints(n, 0, 100000).toArray();
            int[] arr2 = Arrays.copyOf(arr1, n);

            // Đo Insertion Sort
            long start1 = System.currentTimeMillis();
            InsertionSort.sort(arr1);
            long time1 = System.currentTimeMillis() - start1;

            // Đo Merge Sort
            long start2 = System.currentTimeMillis();
            MergeSort.mergeSort(arr2, 0, n - 1);
            long time2 = System.currentTimeMillis() - start2;

            System.out.printf("N = %-6d | InsertionSort: %4d ms | MergeSort: %2d ms%n", n, time1, time2);
        }
    }
}