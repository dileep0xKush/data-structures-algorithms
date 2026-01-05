## 🧩 Problem: *Leftover Candies*

A shopkeeper has a certain number of candies and wants to pack them equally into gift boxes.
Each box must contain the **same number of candies**.

You are given two integers:

* `totalCandies` → total number of candies
* `boxCapacity` → number of candies each box can hold

Your task is to pack the candies and find out:

> **How many candies will remain unpacked** after filling all boxes equally.

Use the remainder operation:

👉 `leftover = totalCandies mod boxCapacity`

---

### ✔️ Input

Two integers:

```
totalCandies boxCapacity
```

---

### ✔️ Output

Print:

```
Remainder = result
```

Where:

```
result = totalCandies mod boxCapacity
```

---

### 🧪 Example 1

**Input**

```
50 9
```

**Output**

```
Remainder = 5
```

---

### 🧪 Example 2

**Input**

```
37 6
```

**Output**

```
Remainder = 1
```

(Meaning after filling boxes of 6 candies each, **1 candy is left over**)
