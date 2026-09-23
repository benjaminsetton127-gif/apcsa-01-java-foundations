# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**
p is principal ,y is years/loan terms , r is the annual rate
**2. What does the method return?**
amount of interest paid 
**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` |ConpoundInterest|
| `p` |principal|
| `y` |loanTerm|
| `r` |interestRate|
| `t` |remainingBalance|

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java
// formula for remaining balance of loan
public static double ConpoundInterest(double principal, int loanTerm, double interestRate) {
    double remainingBalance = principal;
    for (int i = 0; i < loanTerm; i++) {
        remainingBalance = remainingBalance + (remainingBalance * interestRate);
    }
    return remainingBalance - principal;
}
```
## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**
better variable names because it help the readerlearn what this is about. 

> There's no single right answer here. Most professionals would say good names reduce the *need* for comments, and comments should then explain the things names can't — assumptions, edge cases, and why a decision was made.
