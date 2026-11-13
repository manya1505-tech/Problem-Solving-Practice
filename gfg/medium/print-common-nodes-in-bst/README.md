# Common Nodes in Two BSTs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the roots  **r1**  and  **r2** of two Binary Search Trees (BST), find all nodes that are present in both trees i.e. the intersection nodes of the two BSTs.

Return the common node values in sorted order.

 **Examples:** 

```
Input: r1 = [5, 1, 10, 0, 4, 7, N, N, N, N, N, N, 9], r2 = [10, 7, 20, 4, 9, N, N]  

Output: [4, 7, 9, 10]
Explanation: The values present in both BSTs are 4, 7, 9, and 10. Hence, the answer is [4, 7, 9, 10].
```

```
Input: r1 = [10, 2, 11, 1, 3, N, N], r2 = [2, 1, 3]

Output: [1, 2, 3]
Explanation: The values 1, 2, and 3 are present in both BSTs. Hence, the answer is [1, 2, 3].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T13:58:31.301Z  

```java
/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;

  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/


import java.util.*;

class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        inorder(r1, list1);
        inorder(r2, list2);

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).equals(list2.get(j))) {
                ans.add(list1.get(i));
                i++;
                j++;
            } 
            else if (list1.get(i) < list2.get(j)) {
                i++;
            } 
            else {
                j++;
            }
        }

        return ans;
    }

    private void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1)