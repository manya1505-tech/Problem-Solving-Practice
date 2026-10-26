# Minimize Max Min Diff with Subarray Removal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of size  **n**. You need to remove a subarray of size  **k** , such that the difference between the maximum and minimum values of the remaining array is minimized. Find the minimum value obtained after performing the operation of the removal of the subarray.

 **Examples:** 

```
Input: arr = [1, 2, 3, 4, 5], k = 3 
Output: 1
Explanation: We remove first subarray of length 3, the remaining array is [4,5] and the difference of maximum and minimum element is 1 i.e 5 - 4 = 1
```

```
Input: arr = [2, 3, 1, 4, 6, 7], k = 3
Output: 2
Explanation: 
If we remove the subarray [2,3,1] then remaining array is [4,6,7] and the difference  = 7-4 = 3
If we remove the subarray [3,1,4] then remaining array is [2,6,7] and the difference  = 7-2 = 5
If we remove the subarray [1,4,6] then remaining array is [2,3,7] and the difference  = 7-2 = 5
If we remove the subarray [4,6,7] then remaining array is [2,3,1] and the difference  = 3-1 = 2
So the answer is min(3,5,5,2) = 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T15:22:56.145Z  

```java



class Solution {
    public int minDiff(int k, int[] arr) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        if (k == 0) {
            return max - min;
        }

        if (k == n) {
            return 0;
        }

        int[] prefixMin = new int[n];
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        int[] suffixMax = new int[n];

        prefixMin[0] = arr[0];
        prefixMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        suffixMin[n - 1] = arr[n - 1];
        suffixMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int left = i - 1;
            int right = i + k;

            int currMin = Integer.MAX_VALUE;
            int currMax = Integer.MIN_VALUE;

            if (left >= 0) {
                currMin = Math.min(currMin, prefixMin[left]);
                currMax = Math.max(currMax, prefixMax[left]);
            }

            if (right < n) {
                currMin = Math.min(currMin, suffixMin[right]);
                currMax = Math.max(currMax, suffixMax[right]);
            }

            if (currMin != Integer.MAX_VALUE) {
                ans = Math.min(ans, currMax - currMin);
            }
        }

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimize-the-difference/1)