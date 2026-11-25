
class Solution {
    static final long MOD = 1000000007L;

    // Earliest time to reach position x using normal movement
    private long timeToReach(long x, long a, long b) {
        if (x <= a) {
            return x;
        }

        long c = a - b;
        long cycles = (x - a + c - 1) / c;

        return x + 2L * b * cycles;
    }

    // Sum of ceil(i / c) for i = 1 to n
    private long sumCeil(long n, long c) {
        if (n <= 0) {
            return 0;
        }

        long q = n / c;
        long rem = n % c;

        return c * q * (q + 1) / 2 + rem * (q + 1);
    }

    // Sum of normal reaching times from L to R
    private long sumTimes(long L, long R, long a, long b) {
        if (L > R) {
            return 0;
        }

        long count = R - L + 1;

        long sum = (L + R) * count / 2;

        long c = a - b;

        long extra = sumCeil(R - a, c)
                   - sumCeil(L - 1 - a, c);

        return sum + 2L * b * extra;
    }

    public int minTime(int a, int b, int d, int l, int r) {

        long normalTime = timeToReach(d, a, b);

        // Required position before taking the special jump
        long L = (long) d - r;
        long R = (long) d - l;

        // Find the largest y for which 1 + timeToReach(y)
        // is not greater than normalTime.
        long low = L;
        long high = R;
        long cutoff = L - 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (timeToReach(mid, a, b) <= normalTime - 1) {
                cutoff = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Positions up to cutoff use the special jump.
        long countJump = Math.max(0L, cutoff - L + 1);

        long jumpTimeSum = sumTimes(L, cutoff, a, b)
                         + countJump;

        // Remaining positions use normal movement.
        long countNormal = R - cutoff;

        long normalTimeSum = countNormal * normalTime;

        long answer = (jumpTimeSum % MOD
                     + normalTimeSum % MOD) % MOD;

        return (int) answer;
    }
}
