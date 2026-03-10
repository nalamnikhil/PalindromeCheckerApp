## UC6: Queue + Stack Based Palindrome Check

### Goal

To demonstrate palindrome checking using two different data structures: **Queue** and **Stack**.
This use case highlights the behavioral difference between **FIFO (First In First Out)** and **LIFO (Last In First Out)** operations.

### Flow

1. The program starts and takes a predefined string.
2. Each character of the string is inserted into a **Queue** using the enqueue operation.
3. The same characters are also pushed into a **Stack**.
4. Characters are removed from the **Queue (dequeue)** and **Stack (pop)**.
5. The program compares the removed characters.
6. If all characters match, the string is identified as a **palindrome**.

### Key Concepts

* **Queue (FIFO)** – The first element inserted is the first one removed.
* **Stack (LIFO)** – The last element inserted is the first one removed.
* **Enqueue Operation** – Adds elements to the queue.
* **Dequeue Operation** – Removes elements from the queue.
* **Push Operation** – Inserts elements into the stack.
* **Pop Operation** – Removes elements from the stack.
* **Comparison Logic** – Dequeued characters from the queue are compared with popped characters from the stack to determine if the string is a palindrome.

### Data Structures Used

* **Queue**
* **Stack**

### Example

Input String:

```
madam
```

Output:

```
madam is a palindrome
```
