# Concatenation of Array (LeetCode 1929)

Linear-time solution to create a new array by concatenating an array with itself. Each element from the original array appears twice in sequence.

---

## 📂 Files
- `Solution.java`

---

## 🧠 Concept Used
- Array Traversal  
- Index Mapping  
- Fixed-Size Array Allocation  
- Linear Time Complexity  

---

## 🚀 Approach
- Determine the length `n` of the input array  
- Create a new array `ans` of size `2 * n`  
- Copy original elements into:
  - First half → `ans[i] = nums[i]`  
  - Second half → `ans[i + n] = nums[i]`  
- Return the resulting array

---

## ⏱ Complexity
- **Time:** O(n)  
- **Space:** O(n)

---

## 📸 Screenshot
![Program Output1](1.png)  
![Program Output2](2.png)

---

## 👨‍💻 Author
**Sujal Patil**

[![GitHub](https://img.shields.io/badge/GitHub-SujalPatil21-blue)](https://github.com/SujalPatil21)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-SujalPatil-blue)](https://www.linkedin.com/in/sujalpatil)  
[![Email](https://img.shields.io/badge/Email-sujalpatil21@gmail.com-blue)](mailto:sujalpatil21@gmail.com)

