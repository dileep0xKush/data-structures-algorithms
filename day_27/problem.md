## 🔁 Problem: *Transaction ID Palindrome Checker*

In digital systems such as **banking, ticketing, and data validation platforms**, certain numeric identifiers are analyzed for symmetry to detect patterns or validate data integrity.

A **palindrome number** is a number that **reads the same forward and backward**.

You are required to **check whether a given number is a palindrome**.

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Reverses the number using **manual logic**
* Checks whether the original number and the reversed number are the same
* Prints **YES** if the number is a palindrome, otherwise **NO**

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print:

```
YES
```

or

```
NO
```

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
121
```

**Output**

```
YES
```

---

#### Example 2

**Input**

```
123
```

**Output**

```
NO
```

---

#### Example 3

**Input**

```
0
```

**Output**

```
YES
```

---

### 💡 Hint

* Store the original number in a temporary variable
* Reverse the number using `% 10` and `/ 10`
* Compare the original number with the reversed number
