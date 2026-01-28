## 🧮 Problem: *Monthly Savings Growth Tracker*

A personal finance app tracks how a user’s **savings grow each month**.
The growth follows the **Fibonacci pattern**, where each month’s savings growth depends on the **previous two months**.

You are required to **print the Fibonacci series up to `n` terms**.

The Fibonacci series is defined as:

```
F(0) = 0  
F(1) = 1  
F(n) = F(n−1) + F(n−2)
```

---

### ✔️ Task

Write a program that:

* Prints the **Fibonacci series**
* Generates the series **up to `n` terms**

---

### ✔️ Input Format

A single integer:

```
n
```

---

### ✔️ Output Format

Print the Fibonacci series up to `n` terms, separated by spaces.

---

### 🔒 Constraints

```
1 ≤ n ≤ 20
```

---

### 🧪 Sample Test Cases

#### Example 1

**Input**

```
5
```

**Output**

```
0 1 1 2 3
```

---

#### Example 2

**Input**

```
8
```

**Output**

```
0 1 1 2 3 5 8 13
```

---

#### Example 3

**Input**

```
1
```

**Output**

```
0
```

---

### 💡 Hint

* Start with the first two numbers: `0` and `1`
* Each next term is the **sum of the previous two**
* Stop once `n` terms are printed

---

