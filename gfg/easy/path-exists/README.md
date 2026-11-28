# Path Exists Between Two Vertices

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an undirected graph with  **V**  vertices numbered from 0 to V - 1, represented by an adjacency list  **adj[][]**, where adj[i] contains all vertices adjacent to vertex **i**. Also given two vertices  **u** and  **v**, check whether a path exists between them.

Return true if a path exists, otherwise return false.

 **Examples:** 

```
Input: adj[][] = [[2, 3], [2], [0, 1], [0], [5], [4]], u = 1, v = 5

Output: false
Explanation: There is no path from vertex 1 to vertex 5.
```

```
Input: adj[][] = [[2, 3], [2], [0, 1], [0], [5], [4]], u = 2, v = 3

Output: true
Explanation: We can reach vertex 3 from vertex 2 via vertex 0.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T09:56:07.559Z  

```java


import java.util.*;

class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        int V = adj.size();

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == dest) {
                return true;
            }

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        return false;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/path-exists/1)