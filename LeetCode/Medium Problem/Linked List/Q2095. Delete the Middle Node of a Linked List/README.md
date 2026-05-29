# 2095. Delete the Middle Node of a Linked List

A Java solution to the LeetCode problem **Delete the Middle Node of a Linked List**, where the task is to delete the middle node of a singly linked list and return the modified list.

If the linked list contains only one node, the result is an empty list.

The solution first calculates the size of the linked list and then traverses to the node just before the middle node to remove it.

---

## Files
- `Solution.java`

---

## Concept Used
- Linked List
- Traversal
- Node Deletion
- Counting Nodes
- Two-pass Approach  
- Time Complexity: **O(n)**  
- Space Complexity: **O(1)**

---

## Core Logic

- If the linked list contains only one node:
  - Return `null`

- Step 1:
  - Calculate the total number of nodes in the linked list.

- Step 2:
  - Find the middle position using:

```text
middle = size / 2
```

- Step 3:
  - Traverse to the node just before the middle node.

- Step 4:
  - Delete the middle node by updating links:

```text
temp.next = temp.next.next;
```

- Step 5:
  - Return the modified linked list.

---

## Size Calculation

```text
while(node != null){

    node = node.next;
    size++;
}
```

- Counts the total number of nodes present in the linked list.

---

## Middle Node Deletion

```text
temp.next = temp.next.next;
```

- Removes the middle node from the linked list.
- Connects the previous node directly to the next node.

---

## Important Note

- If the linked list has:
  - 1 node → return `null`
  - More than 1 node → delete the middle node and return the updated list

---

## Screenshot

### Test Case
![Test Case](testcase.png)

### Accepted Submission
![Submission](solution.png)

---

## Author

**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-SujalPatil21-blue)](https://github.com/SujalPatil21)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-SujalPatil-blue)](https://www.linkedin.com/in/sujalpatil)  
[![Email](https://img.shields.io/badge/Email-sujalpatil21@gmail.com-blue)](mailto:sujalpatil21@gmail.com)