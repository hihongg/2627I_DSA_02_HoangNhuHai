package btvn_week2.b1_4_12;

import java.util.Scanner;

public class Solution {
    public static void Solution(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int n = a.length;
        while (i < n && j < n ) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int k = 0;k < n;k++) {
            a[k] = scan.nextInt();
        }

        int[] b = new int[n];
        for (int k =0;k <n;k++){
            b[k] = scan.nextInt();
        }
        Solution(a,b);
    }
}