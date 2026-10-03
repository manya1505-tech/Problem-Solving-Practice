# Last Digit of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer **n**  **.** Write a program to print the last digit of n **.** 

 **Examples:** 

```
Input: n = 10
Output: 0
```

```
Input: n = 9768
Output: 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T14:37:38.732Z  

```java
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        // code here
        System.out.println(Math.abs(n) % 10);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-digit-of-a-number--145429/1)