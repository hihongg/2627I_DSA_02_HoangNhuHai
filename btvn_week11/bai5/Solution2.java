package btvn_week11.bai5;
import java.util.*;
public class Solution2 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Collections.sort(arr);
        Collections.sort(brr);
        int length1 = arr.size();
        int length2 = brr.size();
        int j =0;
        List<Integer> result = new ArrayList<>();

        for (int i=0;i < length2;i++) {
            if (j <length1 && brr.get(i).equals(arr.get(j)) ){
                j++;
            } else { if (result.isEmpty()|| !result.get(result.size()-1).equals(brr.get(i)) ){
                result.add(brr.get(i));}
            }
        }
        return result;
    }
}
/*
độ phức tạp thời gian: O(NlogN) + O(MlogM) + O(m)
độ phức tạp không gian: O(M)
 */