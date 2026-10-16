# Sum of upper and lower triangles

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix  **mat[][]**  of size  **n*n**, return an array of two elements containing two values: the sum of Upper Triangle elements and the sum of Lower Triangle elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

 **Examples:** 

```
Input: n = 3, mat[][] = [[6, 5, 4],
                       [1, 2, 5],
                       [7, 9, 7]]
Output: [29, 32]
Explanation: 
Upper triangular matrix:
6 5 4
  2 5
    7
Sum of these elements is 6 + 5 + 4 + 2 + 5 + 7 = 29.
Lower triangular matrix:
6
1 2
7 9 7
Sum of these elements is 6 + 1 + 2 + 7 + 9 + 7 = 32.
```

```
Input: n = 2, mat[][] = [[1, 2],
                       [3, 4]]
Output: [7, 8]
Explanation: 
Upper triangular matrix:
1 2
  4
Sum of these elements are 1 + 2 + 4 = 7.
Lower triangular matrix:
1
3 4
Sum of these elements are 1 + 3 + 4 = 8.
```

 **Constraints:**  
1 ≤ n ≤ 500
1 ≤ mat[i][j] ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T10:22:10.126Z  

```java
class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int upperSum = 0;
        int lowerSum=0;
        for(int i = 0; i<n;i++){
            for(int j = i; j<n; j++){
                upperSum += mat[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                lowerSum += mat[i][j];
            }
        }
        ans.add(upperSum);
        ans.add(lowerSum);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1)