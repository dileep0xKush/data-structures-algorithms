🧮 **Problem: Recursive Investment Growth Predictor**

A financial analytics platform predicts **yearly investment growth** based on past performance.
The growth follows a **Fibonacci pattern**, where each year’s value depends on the **previous two years**.

You are required to **print the Fibonacci series up to `n` terms using recursion**.

The Fibonacci series is defined as:

```
F(0) = 0  
F(1) = 1  
F(n) = F(n − 1) + F(n − 2)
```

---

### ✔️ Task

Write a program that:

* Uses **recursion**
* Prints the **Fibonacci series up to `n` terms**

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
7
```

**Output**

```
0 1 1 2 3 5 8
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

* Use a **recursive function** to calculate Fibonacci numbers
* Define **base cases** for `n == 0` and `n == 1`
* Print values from `0` to `n − 1`

