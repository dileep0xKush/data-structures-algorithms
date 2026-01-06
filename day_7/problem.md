## 🧩 Problem: *Bus Seat Arrangement*

A school is arranging a trip and plans to seat students in a bus.
Each **row has exactly 2 seats** (one on each side).

You are given one integer:

* `students` → total number of students going on the trip

Your task is to determine:

> **Whether all students can be seated perfectly in pairs**, or **one student will be left without a seat partner**.

This depends on whether the number of students is **even or odd**.

Use the condition:

👉 If `students mod 2 = 0` → **Even**
👉 If `students mod 2 = 1` → **Odd**

---

### ✔️ Input

One integer:

```
students
```

---

### ✔️ Output

Print:

```
Even
```

or

```
Odd
```

---

### 🧪 Example 1

**Input**

```
24
```

**Output**

```
Even
```

(Meaning all students can sit in pairs)

---

### 🧪 Example 2

**Input**

```
17
```

**Output**

```
Odd
```

(Meaning **one student will be left without a seat partner**)

