## 🔢 Problem: *Transaction ID Digit Sum Analyzer*

In systems like **banking, inventory management, and data processing**, numeric identifiers are often analyzed not just by their length, but also by the **sum of their digits**.
This digit sum can be used for **basic validation checks, checksum logic, or categorization rules**.

You are required to **calculate the sum of all digits** present in a given integer.

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Uses **manual logic** (no built-in digit-sum functions)
* Extracts each digit of the number
* Computes the **sum of its digits**
* Prints the final sum

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print a single integer representing the **sum of the digits** of `n`.

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
15
```

---

#### Example 2

**Input**

```
7
```

**Output**

```
7
```

---

#### Example 3

**Input**

```
0
```

**Output**

```
0
```

---

### 💡 Hint

* Use `% 10` to extract the last digit
* Add the digit to a running sum
* Use `/ 10` to remove the last digit
* Repeat until the number becomes `0`
