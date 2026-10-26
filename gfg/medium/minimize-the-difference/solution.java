


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
