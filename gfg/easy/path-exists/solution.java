

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
