## UC8: Linked List Based Palindrome Checker

### Goal

To check whether a given string is a palindrome using a **Singly Linked List** data structure.

### Flow

1. The program starts with a predefined string.
2. Each character of the string is converted into a node of a **singly linked list**.
3. A **fast and slow pointer technique** is used to find the middle of the linked list.
4. The **second half of the linked list is reversed** in place.
5. The first half and the reversed second half are compared node by node.
6. If all characters match, the string is identified as a **palindrome**.

### Key Concepts

* **Singly Linked List** – A dynamic data structure where each node stores data and a reference to the next node.
* **Node Traversal** – Accessing each node sequentially using the `next` reference.
* **Fast and Slow Pointer Technique** – Helps efficiently locate the middle of the linked list.
* **In-Place Reversal** – Reverses the second half of the linked list without using additional memory.
* **Efficient Comparison** – Compares nodes from both halves to determine whether the string is a palindrome.

### Data Structure Used

* **Singly Linked List**

### Example

Input String:

```
madam
```

Output:

```
madam is a palindrome
```
