# 6. Basic - Mathematical Operations(HW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.

 **Input Format** 

The first line of input contains two space-separated integers A and B.

 **Constraints** 

1 <= A <= 10^3

1 <= B <= 10^3

 **Output Format** 

The first line of the output should contain the sum of A and B.

The second line of the output should contain the difference of A and B.

The third line of the output should contain the product of A and B.

The fourth line of the output should contain the quotient of A divided by B.

The fifth line of the output should contain the remainder of A modulus by B.

 **Example 1** 

Input:

```
8 3

```

Output:

```
11
5
24
2
2

```

 **Example 2** 

Input:

```
10 2

```

Output:

```
12
8
20
5
0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T14:07:23.777Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        int difference= a-b;
        int product= a*b;
        int quotient= a/b;
        int remainder=a%b;
         System.out.println(sum);
         System.out.println(difference);
         System.out.println(product);
         System.out.println(quotient);
         System.out.println(remainder);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/6-basic-mathematical-operationshw/problem)