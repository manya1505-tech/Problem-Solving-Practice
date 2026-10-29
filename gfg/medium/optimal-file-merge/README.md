# Optimal File Merge

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **files[]**, where  **files[i]**  represents the size of the i-th file, merge all the files into a single file with the minimum total computation cost.

The cost of merging two files of sizes  **x** and  **y** is  **x + y**. After merging, a new file of size **x + y**  is created, which can be merged further with other files.

Return the minimum total cost required to merge all the files.

 **Note:**  It is guaranteed that the minimum total computation cost fits within a 32-bit signed integer.

 **Examples:** 

```
Input: files[] = [3, 2, 4]
Output: 14
Explanation: There are different ways to combine these files. Optimal method is given below:

```

```
Input: files[] = [2, 3, 6, 5, 7, 4]
Output: 68
Explanation: There are different ways to combine these files. Optimal method is given below:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T12:42:54.423Z  

```java

import java.util.*;

class Solution {
    public int minComputation(int[] files) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int file : files) {
            pq.offer(file);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            int merged = a + b;
            totalCost += merged;

            pq.offer(merged);
        }

        return totalCost;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/optimal-file-merge/1)