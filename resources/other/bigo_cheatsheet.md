# Big O Cheat Sheet
<hr>

## Big Os
**O(1)**: Constant. No loops.

**O(log(n))**: Logarithmic. Usually searching algorithms have log(n) if they are sorted (Binary Search), not on hash maps though.

**O(n)**: Linear. For and while loops.

**O(n*log(n))**: Log linear. Sorting operations usually.

**O(n^2)**: Quadratic. Every element in a collection needs to be compared to ever other element. Two nested loops.

**O(2^n)**: Exponential. Recursive algorithms that solve a problem of size n.

**O(n!)**: Factorial. You are adding a loop for every element.

**Iterating through half collection is still O(n).**

**Two separate collections are O(n1 + n2).**
<hr>

## What can cause time in a function?
**Operations:** (+, -, *, /).

**Comparisons:** (<, >, ==).

**Looping:** (for and while).

**Outside function call:** (function()).
<hr>

## Rule book
**Rule 1:** Always worst case.

**Rule 2:** Remove constants.

**Rule 3:** Different inputs should have different variables. (n1 + n2) and for nested is (n1 * n2). *+* for steps in order. <i>*<i> for nested steps.

**Rule 4:** Drop non-dominant terms.
<hr>

## What causes Space Complexity
**Variables**

**Data Structures**

**Functions calls**

**Allocations**
