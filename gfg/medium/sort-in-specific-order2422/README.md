# Sort in Specific Order

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of non-negative integers. Your need to sort them so that

- The first part of the array contains odd numbers sorted in descending order.
- The rest of the portion contains even numbers sorted in ascending order.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
Output: [7, 5, 3, 1, 2, 4, 10]
Explanation: 7, 5, 3, 1 are odd numbers in descending order and 2, 4, 10 are even numbers in ascending order.
```

```
Input: arr[] = [0, 4, 5, 3, 7, 2, 1]
Output: [7, 5, 3, 1, 0, 2, 4]
Explanation: 7, 5, 3, 1 are odd numbers in descending order and 0, 2, 4 are even numbers in ascending order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T13:32:14.316Z  

```java

import java.util.*;

class Solution {
    public void sortIt(int[] arr) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 != 0) {
                odd.add(num);
            } else {
                even.add(num);
            }
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        int index = 0;

        for (int num : odd) {
            arr[index++] = num;
        }

        for (int num : even) {
            arr[index++] = num;
        }
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-in-specific-order2422/1)