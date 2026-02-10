| Feature | ArrayList | LinkedList |
|----------|------------|-------------|
| *Internal Structure* | Dynamic Array | Doubly Linked List (Node-based) |
| *Access Time Complexity* | O(1) | O(n) |
| *Insertion Time Complexity* | O(n) (shifting required) | O(1) at beginning, O(n) at end |
| *Deletion Time Complexity* | O(n) | O(1) at beginning |
| *Memory Usage* | Less (stores only data) | More (stores data + references) |

---

### 1️: Student Record System  
*Answer:* ArrayList  
*Reason:* Fast random access (O(1)) required for fetching student data.

---

### 2️: Browser History  
*Answer:* LinkedList  
*Reason:* Frequent insertions and deletions are required.

---

### 3️: Online Shopping Cart  
*Answer:* ArrayList  
*Reason:* More read operations and quick access to items.

---

### 4️: Undo/Redo Feature  
*Answer:* LinkedList (or Stack implementation)  
*Reason:* Fast insertion and removal operations.