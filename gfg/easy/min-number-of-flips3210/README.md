# Min Flips for Alternate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary string  **s**, we can flip any bit (change 0 to 1 or 1 to 0) to make the string alternating. A string is called alternating if no two adjacent characters are the same.

Find the minimum number of bit flips required to make the string alternating.

 **Examples:** 

```
Input: s = "001"
Output: 1
Explanation: Flip the bit at index 0 from 0 to 1 to obtain "101", which is an alternating binary string. Hence, the minimum number of flips required is 1.

```

```
Input: s = "0001010111" 
Output: 2
Explanation: Flip the bit at indices 1 and 8 to obtain "0101010101", which is an alternating binary string. Hence, the minimum number of flips required is 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T13:47:27.280Z  

```java

class Solution {
    public int minFlips(String s) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {

            // Pattern 1: 010101...
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                count1++;
            }

            // Pattern 2: 101010...
            if (s.charAt(i) != (i % 2 == 0 ? '1' : '0')) {
                count2++;
            }
        }

        return Math.min(count1, count2);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1)