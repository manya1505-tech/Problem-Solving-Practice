# Two Pairs with Same Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of positive integers, find four indices  **a**,  **b**,  **c**, and  **d**  such that arr[a] + arr[b] = arr[c] + arr[d], where a, b, c, d are all distinct indices.

- If multiple such quadruplets exist, return the one that is lexicographically smallest when the indices are considered in the order a, b, c, d.
- If no such quadruplet exists, return {-1, -1, -1, -1}. 
- Ensure a < b and c < d, and the pair (a, b) is lexicographically smaller than the pair (c, d).

 **Examples:** 

```
Input: arr[] = [3, 4, 7, 1, 2, 9, 8]
Output: [0, 2, 3, 5]
Explanation: arr[0] + arr[2] = 3 + 7 = 10, arr[3] + arr[5] = 1 + 9 = 10. 
This is the lexicographically smallest such quadruplet of indices.
```

```
Input: arr[] = [1, 2, 3, 3]
Output: [-1, -1, -1, -1]
Explanation: No two distinct pairs of indices produce the same sum.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T09:57:35.441Z  

```java


import java.util.*;

class Solution {

    static class Pair {
        int a, b, pos;

        Pair(int a, int b, int pos) {
            this.a = a;
            this.b = b;
            this.pos = pos;
        }
    }

    public ArrayList<Integer> findPairs(int[] arr) {

        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
        ArrayList<Pair> allPairs = new ArrayList<>();

        int n = arr.length;

        // Store all pairs in lexicographical order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];

                ArrayList<Pair> list =
                    map.computeIfAbsent(sum, x -> new ArrayList<>());

                Pair p = new Pair(i, j, list.size());

                list.add(p);
                allPairs.add(p);
            }
        }

        // Find the lexicographically smallest valid answer
        for (Pair p : allPairs) {

            ArrayList<Pair> list =
                map.get(arr[p.a] + arr[p.b]);

            for (int j = p.pos + 1; j < list.size(); j++) {

                Pair q = list.get(j);

                if (p.a != q.a && p.a != q.b &&
                    p.b != q.a && p.b != q.b) {

                    ArrayList<Integer> ans = new ArrayList<>();

                    ans.add(p.a);
                    ans.add(p.b);
                    ans.add(q.a);
                    ans.add(q.b);

                    return ans;
                }
            }
        }

        return new ArrayList<>(
            Arrays.asList(-1, -1, -1, -1)
        );
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/satisfy-the-equation5847/1)