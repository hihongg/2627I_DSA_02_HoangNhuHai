package btvn_week5;
import java.util.*;

public class QuicksortInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, n - 1);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Phân chia mảng bằng phương pháp Lomuto
            int p = partition(arr, low, high);

            printArray(arr); // In ra toàn bộ mảng sau mỗi lần phân chia xong

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = low;           // Vị trí lưu phần tử nhỏ hơn hoặc bằng pivot

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        // Đưa pivot về đúng vị trí trung gian giữa 2 nửa
        swap(arr, i, high);
        return i; // Trả về chỉ số của pivot
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + (k == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}

