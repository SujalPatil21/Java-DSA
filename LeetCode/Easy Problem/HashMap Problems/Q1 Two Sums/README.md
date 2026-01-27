# Title
LeetCode 1512 — Number of Good Pairs

---

## Summary
This pull request implements an optimized Java solution for **LeetCode Problem 1512: Number of Good Pairs** using a hash map to count element frequencies and compute valid pairs efficiently.

---

## Purpose / Context
The purpose of this implementation is to:

- Eliminate the O(n²) brute-force approach  
- Use hashing for efficient frequency tracking  
- Demonstrate how previous occurrences contribute to valid pairs  
- Apply interview-standard optimization techniques  

This problem is a classic example of converting nested loops into linear-time logic.

---

## Overview of Implementation
- Initialize a counter to track the number of good pairs.
- Use a `HashMap` to store the frequency of numbers seen so far.
- Traverse the array once.
- For each element:
  - Retrieve its previous frequency.
  - Add that frequency to the pair count.
  - Increment and update the frequency in the map.
- Return the total count.

---

## Key Design Points

### HashMap Frequency Tracking
- Maintains count of each number encountered.
- Enables constant-time lookups.

### Incremental Pair Counting
- Every new occurrence forms a pair with all previous identical values.
- Avoids unnecessary comparisons.

### Single-Pass Efficiency
- Entire solution runs in one loop.
- Improves performance and clarity.

---

## Comparison / Rationale

### Current Implementation
- Time complexity: O(n)
- Scalable and interview-ready.
- Clean and maintainable.

### Alternative Approach
- Nested loops to compare all pairs.
- Sorting-based grouping.
- Higher time complexity or added complexity.

---

## Trade-offs

| Aspect           | Current Implementation | Brute-Force |
|------------------|------------------------|-------------|
| Time Complexity  | O(n)                   | O(n²)       |
| Space Complexity | O(n)                   | O(1)        |
| Readability      | High                   | High        |
| Performance      | Very High              | Low         |

---

## Files Added / Modified
- `Solution.java` — Implementation for LeetCode 1512 (Number of Good Pairs)

---

## How to Test
1. Submit the solution on LeetCode.
2. Test with input `[1,2,3,1,1,3]`.
3. Verify output is `4`.
4. Test edge cases like all identical values.

---

## Notes
- Uses `HashMap<Integer, Integer>` for counting.
- Assumes valid input as per problem constraints.
- Optimized for correctness and performance.

---

## 👨‍💻 Author

**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-SujalPatil21-blue)](https://github.com/SujalPatil21)

