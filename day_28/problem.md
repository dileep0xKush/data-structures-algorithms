## 🔢 Problem: *Transaction ID Digit Counter*

In systems like **banking, inventory management, and data processing**, numeric identifiers are often analyzed based on their **length** to apply validation rules or categorization.

You are required to **count how many digits** are present in a given integer.

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Uses **manual logic** (no built-in digit-counting functions)
* Counts the total number of digits in the number
* Prints the **count of digits**

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print a single integer representing the **number of digits** in `n`.

---

### 🔒 Constraints

```
0 ≤ n ≤ 10^9
```

---

### 🧪 Sample Test Cases

#### Example 1

**Input**

```
12345
```

**Output**

```
5
```

---

#### Example 2

**Input**

```
7
```

**Output**

```
1
```

---

#### Example 3

**Input**

```
0
```

**Output**

```
1
```

---

### 💡 Hint

* If the number is `0`, it has **1 digit**
* Use a loop and repeatedly divide the number by `10`
* Increment a counter each time you divide

---
