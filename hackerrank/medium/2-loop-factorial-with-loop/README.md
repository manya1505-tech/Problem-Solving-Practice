# 2. Loop - Factorial with loop (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Factorial of any given number n is represented as n! = n  *n-1*  n-2.....* 1. Write a program to calculate the factorial of a given number.

Note: Factorial of 0 is 1.

 **Input Format** 

The first line consists of a single integer denoting n.

 **Constraints** 

0 <= n <= 20

 **Output Format** 

Output is a single line containing factorial of n.

```
Example 1   

```

Input:

5

Output:

120

Explanation:

5! = 5 *4* 3 *2* 1 = 120.

```
Example 2

```

Input:

4

Output:

24

Explanation:

4! = 4 *3* 2*1 = 24.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T07:50:59.118Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long ans = 1;
       for(int i = 1; i <= n; i++){
        ans = ans * i;
        }
        System.out.println(ans);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/2-loop-factorial-with-loop/problem)