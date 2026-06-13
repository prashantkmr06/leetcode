# LeetCode Solutions Repo

A collaborative Java Maven repository for solving LeetCode problems and mastering Data Structures, Algorithms, and Problem-Solving Patterns.

The repository is designed to support multiple contributors, allowing each contributor to solve the same problem using different approaches, optimizations, and coding styles while maintaining a clean and scalable project structure.

---

## Objectives

- Master Data Structures and Algorithms
- Learn common coding interview patterns
- Improve problem-solving skills
- Compare different approaches to the same problem
- Build a reusable interview preparation knowledge base
- Encourage collaborative learning

---

## Technology Stack

- Java
- Maven
- JUnit 5

---

## Repository Structure

```text
src
├── main
│   └── java
│       └── com
│           └── leetcode
│               ├── user1
│               │   ├── arrays
│               │   ├── strings
│               │   ├── linkedlist
│               │   ├── tree
│               │   ├── graph
│               │   ├── dynamicprogramming
│               │   ├── greedy
│               │   ├── slidingwindow
│               │   ├── binarysearch
│               │   └── backtracking
│               │
│               ├── user2
│               │   ├── arrays
│               │   ├── graph
│               │   └── dynamicprogramming
│               │
│               ├── user3
│               │   ├── arrays
│               │   ├── graph
│               │   └── dynamicprogramming
│               │
│               └── shared
│                   ├── utilities
│                   ├── common
│                   └── templates
│
└── test
    └── java
```

---

## Package Naming Convention

Each contributor maintains solutions under their own namespace.

Format:

```text
com.leetcode.<username>.<topic>
```

Examples:

```java
package com.leetcode.pk.arrays;

package com.leetcode.pk.graph;

package com.leetcode.pk.dynamicprogramming;
```

This approach:

- Prevents naming conflicts
- Allows multiple solutions for the same problem
- Preserves individual coding styles
- Scales easily as contributors grow

---

## Solution Naming Convention

Each solution class should follow:

```text
LC<ProblemNumber>_<ProblemName>
```

Examples:

```java
LC1_TwoSum
LC20_ValidParentheses
LC121_BestTimeToBuyAndSellStock
LC206_ReverseLinkedList
LC300_LongestIncreasingSubsequence
```

---

## Solution Template

```java
/**
 * Problem Number : 1
 * Problem Name   : Two Sum
 * Difficulty     : Easy
 * Link           : https://leetcode.com/problems/two-sum/
 *
 * Approach:
 * Use a HashMap to store visited elements and their indices.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */
public class LC1_TwoSum {
}
```

---

## Topics Covered

### Data Structures

- Arrays
- Strings
- Linked Lists
- Stacks
- Queues
- Trees
- Binary Search Trees
- Heaps
- Tries
- Graphs

### Algorithms

- Dynamic Programming
- Greedy Algorithms
- Recursion
- Backtracking
- Union Find
- Bit Manipulation

### Problem Solving Patterns

- Sliding Window
- Two Pointers
- Binary Search
- Prefix Sum
- Monotonic Stack
- Fast & Slow Pointers
- BFS
- DFS
- Topological Sort
- Divide and Conquer

---

## Build Instructions

### Compile Project

```bash
mvn clean compile
```

### Run Tests

```bash
mvn test
```

### Build Package

```bash
mvn clean package
```

---

## Contribution Guidelines

1. Create solutions under your own namespace.
2. Follow the standard class naming convention.
3. Add time and space complexity analysis.
4. Include approach explanation.
5. Prefer clean, readable, and maintainable code.
6. Add unit tests where applicable.

---

## Example

Problem:

```text
LeetCode #1 - Two Sum
```

Contributor Solutions:

```text
com.leetcode.user1.arrays.LC1_TwoSum
com.leetcode.user2.arrays.LC1_TwoSum
com.leetcode.user3.arrays.LC1_TwoSum
```

Each contributor may implement a different solution while keeping the repository organized.

---

## Progress Tracker

| Category | Solved |
|-----------|---------|
| Arrays | 0 |
| Strings | 0 |
| Linked Lists | 0 |
| Trees | 0 |
| Graphs | 0 |
| Dynamic Programming | 0 |
| Sliding Window | 0 |
| Binary Search | 0 |
| Backtracking | 0 |
| Greedy | 0 |

---

## Coding Principles

- Write clean and readable code
- Understand the pattern, not just the solution
- Analyze time and space complexity
- Prefer optimal approaches
- Document thought process and trade-offs
- Learn multiple ways to solve the same problem

---

## Long-Term Goals

- Solve 500+ LeetCode problems
- Master all major interview patterns
- Create a collaborative DSA knowledge base
- Prepare for Senior, Staff, Principal Engineer, and Architect-level interviews
- Continuously improve problem-solving skills

---

## License

This repository is intended for educational, learning, and interview preparation purposes.

---

**Learn • Solve • Optimize • Share**
