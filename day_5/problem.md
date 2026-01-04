## 🧩 Problem: *Equal Distribution of Resources*

A school receives a certain number of notebooks to distribute among students in a class.
Each student must receive the **same number of notebooks**.

You are given two integers:

* `totalNotebooks` → total number of notebooks received
* `students` → total number of students in the class

Your task is to **divide the notebooks equally** and find out:

> **How many notebooks each student gets**

Use division to calculate:

👉 `notebooksPerStudent = totalNotebooks ÷ students`

If the division is not exact, the remaining notebooks will stay undistributed.

---

### ✔️ Input

Two integers:

```
totalNotebooks students
```

---

### ✔️ Output

Print:

```
Each student gets = result
```

Where:

```
result = totalNotebooks ÷ students
```

---

### 🧪 Example 1

**Input**

```
100 25
```

**Output**

```
Each student gets = 4
```

---

### 🧪 Example 2

**Input**

```
55 12
```

**Output**

```
Each student gets = 4
```

(Meaning 4 each, and 7 notebooks remain unused)

