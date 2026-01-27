# Title
LeetCode 832 — Flipping an Image

---

## Summary
This pull request adds an optimized Java solution for **LeetCode Problem 832: Flipping an Image**. The implementation flips each row of the binary image horizontally and inverts it in a single pass, achieving optimal time and space efficiency.

---

## Purpose / Context
The purpose of this implementation is to:

- Practice 2D array manipulation  
- Apply two-pointer techniques on matrices  
- Combine multiple operations into a single traversal  
- Write space-efficient, in-place algorithms  

This problem is a common test of array traversal and optimization skills.

---

## Overview of Implementation
- Determine the number of rows and columns in the image.
- Iterate through each row of the matrix.
- Use two pointers (`start` and `end`) to flip the row horizontally.
- During the flip, invert each binary value (`0 → 1`, `1 → 0`).
- Perform all operations in-place.
- Return the modified image.

---

## Key Design Points

### Two-Pointer Technique
- Efficiently swaps elements from both ends of the row.
- Reduces redundant operations.

### In-Place Modification
- No extra matrix or array is created.
- Space complexity remains constant.

### Combined Operations
- Flip and invert are done simultaneously.
- Improves performance and code clarity.

---

## Comparison / Rationale

### Current Implementation
- Time Complexity: O(m × n)
- Space Complexity: O(1)
- Clean and optimized solution.

### Alternative Approach
- First flip the image.
- Then iterate again to invert values.
- Requires extra traversal.

---

## Trade-offs

| Aspect           | Current Implementation | Two-Pass Approach |
|------------------|------------------------|-------------------|
| Time Complexity  | O(m × n)               | O(m × n)          |
| Space Complexity | O(1)                   | O(1)              |
| Readability      | High                   | High              |
| Efficiency       | Very High              | Medium            |

---

## Files Added / Modified
- `Solution.java` — Implementation for LeetCode 832 (Flipping an Image)

---

## How to Test
1. Submit the solution on LeetCode.
2. Test with input `[[1,1,0],[1,0,1],[0,0,0]]`.
3. Verify output is `[[1,0,0],[0,1,0],[1,1,1]]`.
4. Test edge cases like single-row or single-column images.

---

## Notes
- Assumes binary input values only (`0` and `1`).
- Uses arithmetic inversion (`1 - value`) for clarity.
- Optimized for interviews and DSA practice.

---

## 👨‍💻 Author

**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-SujalPatil21-blue)](https://github.com/SujalPatil21)

