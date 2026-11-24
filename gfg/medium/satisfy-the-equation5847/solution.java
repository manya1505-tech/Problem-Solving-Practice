

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
