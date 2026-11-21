package btvn_week11.bai5;
import java.util.*;
public class Solution1 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i : brr) {
            map1.put(i, map1.getOrDefault(i, 0) - 1);
        }
        for (int i : arr) {
            map1.put(i, map1.get(i) + 1);
        }

        List<Integer> arr1 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() != 0) {
                arr1.add(entry.getKey());
            }
        }

        Collections.sort(arr1);

        return arr1;
    }
}
/*
 Hash Table
 độ phức tạp thời gian trung bình: O(n + m + klog(k))
 độ phức tạp không gian: O(k)
 */