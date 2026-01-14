## 🧩 Problem: *Lowest Temperature Reading*

A weather station records the temperature of a city at **three different times** during the day.

You are given three integer values:

* `temp1` → temperature in the morning
* `temp2` → temperature in the afternoon
* `temp3` → temperature in the evening

Your task is to determine:

> **Which time had the lowest temperature**, or whether **two or all three temperatures are equal and lowest**.

---

### ✔️ Input

Three integers:

```
temp1
temp2
temp3
```

---

### ✔️ Output

Print one of the following:

```
Morning temperature is the lowest
```

```
Afternoon temperature is the lowest
```

```
Evening temperature is the lowest
```

```
Two or more times share the lowest temperature
```

---

### 🧪 Example 1

**Input**

```
18
25
21
```

**Output**

```
Morning temperature is the lowest
```

---

### 🧪 Example 2

**Input**

```
20
20
23
```

**Output**

```
Two or more times share the lowest temperature
```