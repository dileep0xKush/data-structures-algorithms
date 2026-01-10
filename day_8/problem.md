## 🧩 Problem: *Temperature Check at a Weather Station*

A weather station records the **temperature of a city** at a given moment.

You are given one integer:

* `temperature` → the recorded temperature value in degrees

Your task is to determine:

> **Whether the temperature is above freezing, below freezing, or exactly at freezing point.**

This depends on whether the number is **positive, negative, or zero**.

Use the condition:

👉 If `temperature > 0` → **Positive**
👉 If `temperature < 0` → **Negative**
👉 If `temperature = 0` → **Zero**

---

### ✔️ Input

One integer:

```
temperature
```

---

### ✔️ Output

Print one of the following:

```
Positive
```

```
Negative
```

```
Zero
```

---

### 🧪 Example 1

**Input**

```
12
```

**Output**

```
Positive
```

(Meaning the temperature is **above freezing**)

---

### 🧪 Example 2

**Input**

```
-7
```

**Output**

```
Negative
```

(Meaning the temperature is **below freezing**)

---

### 🧪 Example 3

**Input**

```
0
```

**Output**

```
Zero
```

(Meaning the temperature is **exactly at freezing point**)

