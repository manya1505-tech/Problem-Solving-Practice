# 1. Conditional - we are odd (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two integers a and b. You need to perform the following operations

If both integers are odd, print `we are odd`. Else print `we are simple`.

 **Input Format** 

First line contains two variables a and b.

Example 1 Input

`1 3`

Example 2 Input

`2 5`

 **Constraints** 

-10^8 <= a, b <= 10^8

 **Output Format** 

Output will be "we are odd" if both the variables are odd numbers. Otherwise output will be "we are simple".

Example 1 Output

`we are odd`

Example 1 Output

`we are simple`

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:10:47.352Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("we are odd");
        } else{
            System.out.println("we are simple");
        }
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/1-we-are-odd/problem)