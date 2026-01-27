# Title
LeetCode 1 — Two Sum (HashMap Approach) + Add README Files

---

## Summary
This pull request adds an optimized Java solution for **LeetCode Problem 1: Two Sum** using a hash map. Additionally, it introduces `README.md` files in the **Array Problems** and **HashMap Problems** folders under the **Easy Problems** directory to improve documentation and structure.

---

## Purpose / Context
The purpose of this update is to:

- Implement an efficient O(n) solution for the Two Sum problem  
- Demonstrate real-world usage of hash maps for fast lookups  
- Improve repository documentation by adding folder-level READMEs  
- Make the Easy Problems directory more organized and beginner-friendly  

This aligns the repository with clean-code and documentation best practices.

---

## Overview of Implementation
- Uses a `HashMap` to store previously seen numbers and their indices.
- For each element, computes the required complement (`target - nums[i]`).
- Checks if the complement already exists in the map.
- Returns the pair of indices as soon as a valid match is found.
- Adds README files explaining structure and intent of Array and HashMap problem folders.

---

## Key Design Points

### HashMap-Based Optimization
- Eliminates nested loops.
- Achieves linear time complexity.

### Early Exit Strategy
- Returns immediately upon finding a valid pair.
- Avoids unnecessary iterations.

### Documentation Improvements
- README files clarify problem categorization.
- Improves navigation and maintainability.

---

## Comparison / Rationale

### Current Implementation
- Time Complexity: O(n)
- Uses extra space for efficiency.
- Interview-standard approach.

### Alternative Approach
- Brute-force nested loops (O(n²)).
- No extra space but poor performance.

---

## Trade-offs

| Aspect           | HashMap Approach | Brute-Force |
|------------------|------------------|-------------|
| Time Complexity  | O(n)             | O(n²)       |
| Space Complexity | O(n)             | O(1)        |
| Readability      | High             | High        |
| Performance      | Very High        | Low         |

---

## Files Added / Modified
- `Solution.java` — Implementation for LeetCode 1 (Two Sum)
- `Easy/Array Problems/README.md` — Documentation for array-based problems
- `Easy/HashMap Problems/README.md` — Documentation for hash map-based problems

---

## How to Test
1. Submit the Two Sum solution on LeetCode.
2. Test with input `[2,7,11,15]`, `target = 9`.
3. Verify output is `[0,1]`.
4. Open both README files and confirm content clarity.

---

## Notes
- Assumes exactly one valid solution exists as per problem statement.
- Uses `HashMap<Integer, Integer>` for fast lookups.
- No functional changes outside the Two Sum solution.

---

## 👨‍💻 Author

**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-SujalPatil21-blue)](https://github.com/SujalPatil21)
