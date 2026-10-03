# 4. Basic - Input/Output(CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.

For example:

```
Scanner scanner = new Scanner(System.in);
int myInt = scanner.nextInt();

```

For printing it

```
System.out.println(myInt);

```

The code above creates a Scanner object named scanner and uses it to read an integer. It prints output using System.out.println(MyInt). So, if our input is:

`5`

Our code will print:

`5`

In this challenge, you must read 3 integers and then print them. Each integer must be printed on a new line.

 **Input Format** 

There are 3 lines of input, and each line contains a single integer.

 **Constraints** 

1 <= integer <= 10^9

 **Output Format** 

```
3 lines of output, each line containing a single integer

```

 **Example 1**  Input

```
42
100
125

```

Output

```
42
100
125

```

 **Example 2**  Input

```
452
105
25

```

Output

```
452
105
25

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T13:52:47.925Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/4-basic-inputoutputcw/problem)