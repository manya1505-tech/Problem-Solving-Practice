# Character at Position in Infinite String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**  and an integer  **pos**, an infinite string is constructed by repeatedly applying the following operation. In the i-th step, append i consecutive $ characters, followed by the reverse of the current string, to the current string.

Formally, if the current string is s, update it as:

- s = s + ('$' repeated i times) + reverse(s)

The initial string is the given s, and the process continues indefinitely.

Find and return the character at the pos(1-based indexing) in the resulting infinite string.

 **Examples:** 

```
Input: s = "12345", pos = 3
Output: 3
Explanation: In "12345...", the character at pos 3 is 3.

```

```
Input: s = "12345", pos = 10
Output: 2
Explanation: In "12345$54321...", the character at pos 10 is 2.

```

```
Input: s = "abc", pos = 7
Output: a
Explanation: In "abc$cba...", the character at pos 7 is a.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T04:48:41.205Z  

```java

class Solution {
    public char posInfinite(String s, int pos) {
        long p = pos;
        long len = s.length();

        // Find the expansion level containing the position
        long[] lengths = new long[50];
        long[] steps = new long[50];

        int count = 0;
        lengths[0] = len;

        while (len < p) {
            long step = count + 1;
            steps[count] = step;
            len = 2 * len + step;
            count++;
            lengths[count] = len;
        }

        // Trace the position backwards
        while (count > 0) {
            long oldLen = lengths[count - 1];
            long step = steps[count - 1];

            if (p <= oldLen) {
                count--;
            } 
            else if (p <= oldLen + step) {
                return '$';
            } 
            else {
                p = 2 * oldLen + step - p + 1;
                count--;
            }
        }

        return s.charAt((int) p - 1);
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-infinite-string1049/1)