## 🔁 Problem: *Transaction ID Reverser*

A digital payment system generates **numeric transaction IDs**.
For certain verification checks, the system needs to **reverse the digits** of a given transaction ID.

Your task is to **reverse a given integer** and display the reversed number.

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Reverses its digits
* Prints the reversed number

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print the reversed number:

```
reversed_n
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
1234
```

**Output**

```
4321
```

---

#### Example 2

**Input**

```
1000
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
0
```

---

### 💡 Hint

You can reverse a number by:

* Extracting digits using `% 10`
* Removing digits using `/ 10`
* Building the reversed number step by step
