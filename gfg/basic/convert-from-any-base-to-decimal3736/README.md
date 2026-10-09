# Given Base to Decimal Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **n**  and its base  **b**, convert it to decimal. The base of number can be anything such that all digits can be represented using 0 to 9 and A to Z. Value of A is 10, value of B is 11 and so on.

 **Examples:** 

```
Input: b = 2, n = "1100"
Output: 12
Explanation: It is a binary number whose decimal equivalent is 12.
```

```
Input: b = 16, n = "A"
Output: 10
Explanation: It's a hexadecimal number whose decimal equivalent is 10.
```

 **Constraints:** 
1 ≤ b ≤ 16
1 ≤ n ≤ decimal equivalent 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T09:27:25.282Z  

```java
class Solution {
    public long decimalEquivalent(String n, int b) {
        long result = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            result = result * b + digit;
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-from-any-base-to-decimal3736/1)