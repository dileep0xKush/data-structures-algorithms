## 🧩 Problem: *Competition Score Ranking*

A school is organizing a quiz competition where **three students** participate in the final round.
Each student receives a score based on their performance.

You are given three integers:

* `score1` → score of Student 1
* `score2` → score of Student 2
* `score3` → score of Student 3

Your task is to determine:

> **Which student has the highest score**, or whether **two or all three students have equal highest scores**.

Use comparison logic such as:

👉 Check which score is greater among the three
👉 Handle cases where two or more scores are equal

---

### ✔️ Input

Three integers:

```
score1
score2
score3
```

---

### ✔️ Output

Print one of the following (based on the result):

```
Student 1 has the highest score
```

```
Student 2 has the highest score
```

```
Student 3 has the highest score
```

```
Two or more students share the highest score
```

---

### 🧪 Example 1

**Input**

```
78
91
65
```

**Output**

```
Student 2 has the highest score
```

---

### 🧪 Example 2

**Input**

```
85
85
79
```

**Output**

```
Two or more students share the highest score
```
