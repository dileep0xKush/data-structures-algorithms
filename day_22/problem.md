## 🧮 Problem: *Recursive Factorial Calculator*

A task management system needs to calculate the **number of possible arrangements of tasks**.
This number is calculated using the **factorial** of a given value.

You are required to **find the factorial of a non-negative integer using recursion**.

The factorial of a number `n` is defined as:

```
n! = n × (n − 1) × (n − 2) × ... × 1
```

### Special Case

```
0! = 1
```

---

### ✔️ Task

Write a program that:

* Uses **recursion**
* Calculates and prints the **factorial of the given number**

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print the factorial of `n`.

---

### 🔒 Constraints

```
0 ≤ n ≤ 15
```

---

### 🧪 Sample Test Cases

#### Example 1

**Input**

```
4
```

**Output**

```
24
```

#### Example 2

**Input**

```
6
```

**Output**

```
720
```

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

Use:

* A **base case** when `n == 0` or `n == 1`
* A **recursive call** for `n > 1`

---