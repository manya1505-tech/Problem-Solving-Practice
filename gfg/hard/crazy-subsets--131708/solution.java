
class Solution {
    static final long MOD = 1000000007L;

    public int cntSubsets(int[] arr, int l, int r) {
        int n = arr.length;

        int[] freq = new int[n + 1];

        for (int x : arr) {
            if (x <= n) {
                freq[x]++;
            }
        }

        long[] pow2 = new long[n + 1];
        pow2[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        long required = 1;
        long ans = 0;
        int prefixCount = 0;

        for (int mex = 0; mex <= r; mex++) {
            prefixCount += freq[mex];

            long greater = pow2[n - prefixCount];
            long ways = (required * greater) % MOD;

            if (mex >= l) {
                ans = (ans + ways) % MOD;
            }

            long factor = (pow2[freq[mex]] - 1 + MOD) % MOD;
            required = (required * factor) % MOD;
        }

        return (int) ans;
    }
}
