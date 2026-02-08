## 🔢 Problem: *Product of Digits of a Number*

In many applications such as **data validation and identifier analysis**, the **product of digits** of a number is used as a simple verification metric.

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Extracts each digit using manual logic
* Computes the **product of all digits**
* Prints the final product

---

### ✔️ Input Format

```
n
```

---

### ✔️ Output Format

Print a single integer representing the **product of the digits** of `n`.

---

### 🔒 Constraints

```
0 ≤ n ≤ 10^9
```

---

### 🧪 Sample Input

```
234
```

---

### 🧪 Sample Output

```
24
```

---

### 💡 Hint

* Use `% 10` to extract the last digit
* Multiply it with a running product
* Use `/ 10` to remove the last digit
* Repeat until the number becomes `0`
