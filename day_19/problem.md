## 🧩 Problem: *Prime Numbers in a Secure Key Range*

In a cybersecurity system, **prime numbers are used to generate encryption keys**.
To analyze key strength, the system needs to identify **all prime numbers within a given range**.

You are assigned to write a program that finds and prints **all prime numbers between two given integers**.

A number is considered **prime** if:

* It is greater than `1`
* It has **exactly two distinct divisors**: `1` and itself

---

### ✔️ Input

Two integers:

```
start
end
```

---

### ✔️ Output

Print all **prime numbers** between `start` and `end` (inclusive), separated by a space.

If **no prime numbers** exist in the range, print:

```
No prime numbers found
```

---

### 🧪 Examples

**Example 1**

**Input**

```
10
30
```

**Output**

```
11 13 17 19 23 29
```

---

**Example 2**

**Input**

```
1
10
```

**Output**

```
2 3 5 7
```

---

**Example 3**

**Input**

```
14
16
```

**Output**

```
No prime numbers found
```