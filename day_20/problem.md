## 🧩 Problem: *Composite Number Detection for System Validation*

In a system diagnostics module, **composite numbers indicate weak configuration values** that must be flagged for review.

Your task is to write a program that **checks whether a given number is composite**.

A number is considered **composite** if:

* It is greater than `1`
* It has **more than two distinct divisors**
* In other words, it is **not prime and not 1**

---

### ✔️ Input

A single integer:

```
n
```

---

### ✔️ Output

* Print `Composite` if the number is composite
* Otherwise, print `Not Composite`

---

### 🧪 Examples

#### Example 1

**Input**

```
12
```

**Output**

```
Composite
```

---

#### Example 2

**Input**

```
7
```

**Output**

```
Not Composite
```

---

#### Example 3

**Input**

```
1
```

**Output**

```
Not Composite
```

---

#### Example 4

**Input**

```
9
```

**Output**

```
Composite
```