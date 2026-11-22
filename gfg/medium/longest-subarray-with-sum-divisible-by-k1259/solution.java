
import java.util.*;

class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int remainder = ((sum % k) + k) % k;

            if (map.containsKey(remainder)) {
                maxLength = Math.max(maxLength, i - map.get(remainder));
            } else {
                map.put(remainder, i);
            }
        }

        return maxLength;
    }
}

