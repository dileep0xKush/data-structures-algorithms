## 🧩 Problem: *Comparing Two Delivery Packages*

A courier company needs to decide **which of two packages is heavier** so it can place the heavier one at the bottom during transport.

You are given two integers:

* `package1` → weight of the first package
* `package2` → weight of the second package

Your task is to determine:

> **Which package is heavier**, or if both have the **same weight**.

Use the condition:

👉 If `package1 > package2` → **Package 1 is heavier**
👉 If `package2 > package1` → **Package 2 is heavier**
👉 If both are equal → **Both packages have the same weight**

---

### ✔️ Input

Two integers:

```
package1
package2
```

---

### ✔️ Output

Print one of the following:

```
Package 1 is heavier
```

```
Package 2 is heavier
```

```
Both are equal
```

---

### 🧪 Example 1

**Input**

```
15
20
```

**Output**

```
Package 2 is heavier
```

---

### 🧪 Example 2

**Input**

```
30
30
```

**Output**

```
Both are equal
```
