# Build Array from Permutation (LeetCode 1920)

Efficient array-mapping solution to construct a new array where each element is formed using index-based permutation. Achieves **O(n)** time complexity.

---

## 📂 Files
- `Solution.java`

---

## 🧠 Concept Used
- Array Index Mapping  
- One-Pass Traversal  
- Direct Index Access  
- Linear Time Complexity  

---

## 🚀 Approach
- Create a new array `ans` of same size as `nums`
- Traverse the array  
- For each index `i`, assign:  
  `ans[i] = nums[nums[i]]`
- Return the constructed array

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
