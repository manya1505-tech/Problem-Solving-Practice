# 3. Basic - Quotient-Reminder Calculator(CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Declare two variables as a and b. Initialize the values to those variables as 1042 and 7 respectively.

Declare another two variables quo and rem that will store the quotient and remainder of these numbers taking a as dividend and b as divisor.

Print quo and rem in a line separated by a space.

 **Input Format** 

No input. User has to declare the variables themselves.

 **Constraints** 

NA

 **Output Format** 

Print the quotient and remainder of these numbers by taking a as dividend and b as divisor.

Output:

```
148 6 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T13:49:42.900Z  

```java

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a = 1042;
        int b = 7;
        int quo = a/b;
        int rem =a%b;
        System.out.print(quo+ " " +rem);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/3-basic-quotient-reminder-calculatorcw/problem)