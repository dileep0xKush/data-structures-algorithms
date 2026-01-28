## 🧮 Problem: *Investment Milestone Validator*

A financial analytics system tracks **investment growth milestones** over time.
These milestones follow the **Fibonacci pattern**, where each value is derived from the sum of the previous two.

Before approving a milestone, the system must **verify whether a given value is part of the Fibonacci series**.

You are required to **check if a given number belongs to the Fibonacci sequence**.

The Fibonacci series is defined as:

```
0, 1, 1, 2, 3, 5, 8, 13, 21, ...
```

---

### ✔️ Task

Write a program that:

* Takes a single integer input
* Checks whether the number is a **Fibonacci number**
* Prints **YES** if it belongs to the Fibonacci series, otherwise **NO**

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
21
```

**Output**

```
YES
```

---

#### Example 2

**Input**

```
22
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

A number `n` is a Fibonacci number **if and only if**:

```
(5 × n² + 4) OR (5 × n² − 4)
```

is a **perfect square**.

