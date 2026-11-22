package btvn_week11.bai5;
import java.util.*;
public class Solution3 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        int max = Collections.max(brr);
        int min = Collections.min(brr);
        List<Integer> result = new ArrayList<>();

        int[] count=new int[max - min +1];
        for (int i : brr) {
            count[i-min]++;
        }
        for (int i : arr) {
            count[i-min]--;
        }
        for (int i=0;i<count.length;i++ ){
            if(count[i]>0) {
                result.add(i+min);
            }
        }
        return result;
    }
}
/*
độ phức tạp thời gian: O(m+m+k)
độ phức tạp không gian: O(k)
 */