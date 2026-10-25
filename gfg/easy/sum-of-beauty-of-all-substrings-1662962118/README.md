# Sum of Beauty of All Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, return the sum of the beauty of all substrings of s. The beauty of a substring is defined as the difference between the maximum and minimum frequencies of the characters present in that substring.

 **Examples:** 

```
Input: s = "aaac"
Output: 3
Explanation: The substrings with non-zero beauty are "aaac" and "aac". 
For "aaac", the frequencies are a = 3 and c = 1. Its beauty is 3 − 1 = 2. 
For "aac", the frequencies are a = 2 and c = 1. Its beauty is 2 − 1 = 1. 
The remaining substrings have a beauty of 0. Therefore, the sum of the beauties of all substrings is 2 + 1 = 3.
```

```
Input: s = "aabc"
Output: 2
Explanation: The substrings with non-zero beauty are "aab" and "aabc". 
For "aab", the frequencies are a = 2 and b = 1. Its beauty is 2 − 1 = 1. 
For "aabc", the frequencies are a = 2, b = 1, and c = 1. Its beauty is 2 − 1 = 1. 
Therefore, the sum of the beauties of all substrings is 1 + 1 = 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T09:57:59.091Z  

```java
class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                sum += maxFreq - minFreq;
            }
        }

        return sum;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1)