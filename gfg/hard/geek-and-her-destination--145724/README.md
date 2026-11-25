# Geek's Destination with Special Jump

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Geek starts at position  **0**  on the positive X-axis and needs to reach or pass position  **d**  on the positive X-axis.

Geek normally follows a repeating movement pattern:

- Move forward by a units, taking a seconds.
- Move backward by b units, taking b seconds.

Geek also has a special jump that moves him exactly  **j**  units forward in 1 second. He can use it at any time, even in the middle of a forward or backward movement, and the journey ends immediately after the jump.

Given five integers  **a**,  **b**,  **d**,  **l**, and  **r**. For every integer j in the range [l, r], find the minimum time required for Geek to reach or pass position d. He may either use the special jump or reach the destination using normal movement alone, whichever takes less time.

Return the sum of the minimum times for all jump lengths from l to r. Since, the answer can be large, return modulo 109 + 7. 

 **Note:** Each jump length is considered independently.

 **Examples:** 

```
Input: a = 2, b = 1, d = 5, l = 3, r = 4
Output: 5
Explanation: 
For j = 3, Geek moves 2 units forward, then takes a jump of 3 units to reach the destination. The minimum time required is 3 seconds.
For j = 4, Geek moves 1 unit forward, then takes a jump of 4 units to reach the destination. The minimum time required is 2 seconds.
Total sum for the range [l, r] = 3 + 2 = 5.
```

```
Input: a = 4, b = 2, d = 8, l = 2, r = 4
Output: 26
Explanation:
For j = 2, Geek moves 4 units forward, then 2 units backward. She then moves 4 units forward again and takes a jump of 2 units to reach the destination. The minimum time required is 11 seconds.
For j = 3, Geek moves 4 units forward, then 2 units backward. She then moves 3 units forward and takes a jump of 3 units to reach the destination. The minimum time required is 10 seconds.
For j = 4, Geek moves 4 units forward, then takes a jump of 4 units to reach the destination. The minimum time required is 5 seconds.
Total sum for the range [l, r] = 11 + 10 + 5 = 26.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T08:12:52.284Z  

```java

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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/geek-and-her-destination--145724/1)