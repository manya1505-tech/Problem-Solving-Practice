
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
