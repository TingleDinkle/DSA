

## Contents

- INTRODUCTION — 7
- CONTENT — 8
  - Design specification for data structures explaining the valid operations that can be carried out on the structures — 8
  - Illustrate, with an example, a concrete data structure for a First in First out (FIFO) queue — 25
  - Determine the operations of a memory stack and how it is used to implement function calls in a computer — 28
  - Specify the abstract data type for a software stack using an imperative definition — 31
  - Compare the performance of two sorting algorithms — 36
  - Examine the advantages of encapsulation and information hiding when using an ADT — 42
  - Analyse the operation, using illustrations, of two network shortest path algorithms, providing an example of each — 46
  - Discuss the view that imperative ADTs are a basis for object orientation offering a justification for the view — 51
- CONCLUSION — 55
- REFERENCES — 56

---

## TABLE OF FIGURES

- Figure 1: Singly-linked list node — 8
- Figure 2: insert and print function — 9
- Figure 3: Main function — 10
- Figure 4: Output — 10
- Figure 5: Delete at first and print function — 11
- Figure 6: Main function — 12
- Figure 7: The output — 12
- Figure 8: Traverse function — 13
- Figure 9: Main function — 14
- Figure 10: Output — 14
- Figure 11: Node class — 16
- Figure 12: Initialize the stack — 16
- Figure 13: Stack validation — 17
- Figure 14: Push operation — 17
- Figure 15: Pop operation — 18
- Figure 16: Main function — 18
- Figure 17: Print function — 19
- Figure 18: Output — 19
- Figure 19: Node class — 20
- Figure 20: Array Queue — 20
- Figure 21: Data validation — 21
- Figure 22: enqueue operation — 21
- Figure 23: Dequeue operation — 22
- Figure 24: print function — 22
- Figure 25: Main function — 23
- Figure 26: Output — 24
- Figure 27: Node class — 25
- Figure 28: Level Order recursive — 26
- Figure 29: Traverse function — 26
- Figure 30: Main function — 27
- Figure 31: Output — 28
- Figure 32: Tree structure — 28
- Figure 33: factorial function — 29
- Figure 34: Stack visualization — 29
- Figure 35: Stack visualization — 30
- Figure 36: Node class — 33
- Figure 37: Initialize the stack — 33
- Figure 38: Stack validation — 34
- Figure 39: Push operation — 34
- Figure 40: Pop operation — 35
- Figure 41: Main function — 35
- Figure 42: Print function — 36
- Figure 43: Output — 36
- Figure 44: Bubble sort code — 39
- Figure 45: Merge sort initialization — 39
- Figure 46: Merge sort splitting — 40
- Figure 47: Merge sorting — 40
- Figure 48: Merge sort — 41
- Figure 49: Main function — 41
- Figure 50: Output — 42
- Figure 51: Example of Stack ADT — 44
- Figure 52: weighted graph — 47
- Figure 53: weighted graph — 49
- Figure 54: BankAccount class — 53

---

## INTRODUCTION

**What is an Abstract Data Type?**

**Abstract Data Type (ADT):**
- Defines a particular data structure in terms of data and operations
- Offers an interface of the objects (instances of an ADT)

**An ADT consists of:**
- Declaration of data
- Declaration of operations
- Encapsulation of data and operations: data is hidden from user and can be manipulated only by means of operations

### ADT example: Floating point numbers

- You don't need to know how much about floating point arithmetic works to use *float*
- Indeed, the details can vary depending on processor, even virtual coprocessor
- But the compiler hides all the details from you — some numeric ADTs are built-in
- All you need to know is the syntax and meaning of operators, +, -, *, /, etc.
- Hiding the details of implementation is called **encapsulation (data hiding).**

---

## CONTENT

### Design specification for data structures explaining the valid operations that can be carried out on the structures.

#### a, Linked list

A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers. In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.

There are some types of linked lists such as:
- Singly-linked list
- Doubly-linked list
- Circular Linked List
- Doubly Circular linked list

Now, I will explain operations and working mechanism of a linked list mainly the singly-linked list.

---

#### Insert () – insert a node at the beginning at the list

- First, we will create a node so we can insert it, the node contains 2 variables, the first being the info as know as the value of the node while the second variable will call itself in it and holds the value of the next node.
- After that, we will use constructor to initialize the node.

*Figure 1: Singly-linked list node*

- Then we will create a function that will create a node at the front of our list. Then a function to print out the value.

*Figure 2: insert and print function*

- Then we will have our main function to run the code, first we will create some new Node to set up our list then initialize a variable x to create a new node and insert it at the front of the list.

*Figure 3: Main function*

- As you can see, the node we created has been inserted at the front of the list.

*Figure 4: Output*

---

#### Deletion (head) – delete the first value of the list

- Coming up next is the deletion, we will keep using the Node we created earlier. First we create 2 functions. First one being deleting the first node of the list and the second one prints the value after deletion. To delete the first node of the list we will need to check if the list is empty or not then we will change the value of the head we are deleting to a temp variable then change the head pointer to the next node finally setting the temp variable to null and return the new head.

*Figure 5: Delete at first and print function*

- Then we have our main function with hard-coded linked list, setting up our head as the Node that has the value of 8.

*Figure 6: Main function*

- This is the output after we delete the head node of the list above.

*Figure 7: The output*

---

#### Traverse(head) – printing the value of each node and then going on to the next node and print that node's value also and so on, till we reach the last node in the singly linked list

- Still using the Node we created above, we will create a function that traverse through the list and print all of it's value.

*Figure 8: Traverse function*

- This is our hard-coded linked list with 4 value and a traverse function at the end.

*Figure 9: Main function*

- This is our output after running the code, showing all the values of the list.

*Figure 10: Output*

---

#### b, Stack

**Stack** is a linear data structure that follows LIFO (Last In First Out) Principle, the last element inserted is the first to be popped out. It means both insertion and deletion operations happen at one end only.

#### LIFO (Last In First Out) Principle

The LIFO principle means that the last element added to a stack is the first one to be removed.

- New elements are always pushed on top.
- Removal (pop) also happens only from the top.
- This ensures a strict order: last in → first out.

There is also some type of stack such as:

**Fixed Size Stack**
- A fixed size stack has a predefined capacity.
- Once it becomes full, no more elements can be added (this causes overflow).
- If the stack is empty and we try to remove an element, it causes underflow.
- Typically implemented using a static array.

**Dynamic Size Stack**
- A dynamic size stack can grow and shrink automatically as needed.
- If the stack is full, its capacity expands to allow more elements.
- As elements are removed, memory usage can shrink as well.

Moving on, we will discuss about its operations and working mechanisms we will implement the stack using array.

---

#### Push () - Adds an item to the stack.

- First, we will create a Node class so we can push it into the stack.

*Figure 11: Node class*

- We will then create another class and initialize our array with 2 variables being top and max. Then we will use constructor to initialize the Stack with the stack being empty at -1 since the index of an array start at 0.

*Figure 12: Initialize the stack*

- Then we have 2 operations to check if the stack is either empty or it's full.

*Figure 13: Stack validation*

- After that we will have our push operation. It will check if the stack is full or not, if its not then the top value is increased then the new value will be the one on top.

*Figure 14: Push operation*

---

#### Pop() - Removes an item from the stack. The items are popped in the reversed order in which they are pushed.

- Then coming up next which is our pop operation. It will check if its empty or not if its not empty then it will make the node below the top then minus the top counter by 1.

*Figure 15: Pop operation*

- Then we will implement the code into main function. We will create a "ms" with data type of MyStack then we can use its operation we created. Now I will push some data in and test if it is working properly.

*Figure 16: Main function*

*Figure 17: Print function*

- As you can see this is our output, since I set my stack at 5 is max and tried to push a new node with a value of '6' it says that the Stack is full. After that I pop the stack twice and print again and it pop out the data that got pushed in the latest.

*Figure 18: Output*

---

#### c, Queue

- Queue is a linear data structure that follows FIFO (First In First Out) Principle, so the first element inserted is the first to be popped out.
- It is an ordered list in which insertions are done at one end which is known as the rear and deletions are done from the other end known as the front.
- A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.
- The difference between stack and queue is in removing an element. In a stack we remove the item that is most recently added while in a queue, we remove the item that is least recently added.

**FIFO Principle in Queue:**

FIFO Principle states that the first element added to the Queue will be the first one to be removed or processed. So, Queue is like a line of people waiting to purchase tickets, where the first person in line is the first person served. (i.e. First Come First Serve).

Next up we will discuss about the Queue operations and its working mechanism, we will implement it using Array.

---

#### Enqueue (): Adds an element to the end (rear) of the queue.

- First, we still need a Node class to enqueue the node in.

*Figure 19: Node class*

- First we initialize our array then 4 variables being max, first, last and size then use constructor to initialize our Queue.

*Figure 20: Array Queue*

- Then we have our 2 operations that will check to see if the queue is full or not

*Figure 21: Data validation*

- Then we have our enqueue operation, first it will check to see if the queue is full or not if it's not full yet a node will be enqueue

*Figure 22: enqueue operation*

---

#### Dequeue () - Removes the element from the front of the queue.

- Next, we have our dequeue operation which is used to remove the front element from the queue, first we still have to check if its empty or not, if its not empty the first element will be removed from the queue.

*Figure 23: Dequeue operation*

*Figure 24: print function*

- As you can see here, this is the main function, first we will enqueue some elements in after that we will print the elements then dequeue the first element then prints again and finally enqueue more 2 more node

*Figure 25: Main function*

- This is our output, after the enqueue, the dequeue and more enqueue.

*Figure 26: Output*

- The link below is my GitHub repository for the code above: https://github.com/Uppthefirst/ASM1_code_demo

---

### Illustrate, with an example, a concrete data structure for a First in First out (FIFO) queue.

Coming up next, we will have some example for the concrete FIFO structure by solving some easy problem using Queue ADT structure.

#### Level Order Traversal (Breadth First Search) of Binary Tree using Recursion - O(n) time and O(n) space

- First we will import an Array List util and create a Node class with its base value and its child node with null values.

*Figure 27: Node class*

- Create a void function with parameters, a root, level and an Array List, it will check if the root if null or not then add a new level if needed then add the node's data based on the level and recur for left and right children.

*Figure 28: Level Order recursive*

- Then we will have a function that traverse around the tree and store the result level by level

*Figure 29: Traverse function*

- This is my code for the main function, by adding a base root with a value of 5 adding its child nodes and print all of its value.

*Figure 30: Main function*

- This is my output for the code above as you can see it acts like a tree structure

*Figure 31: Output*

*Figure 32: Tree structure*

---

### Determine the operations of a memory stack and how it is used to implement function calls in a computer.

- **Stack memory:** The stack is a segment of memory that stores temporary variables created by a function. In stack, variables are declared, stored and initialized during runtime.
- When we compile a program, the compiler enters through the main function and a stack frame is created on the stack. A structure, also known as an activation record, is the collection of all data on the stack associated with one subprogram call. The main function and all the local variables are stored in an initial frame.
- It is a temporary storage memory. When the computing task is complete, the memory of the variable will be automatically erased. The stack section mostly contains methods, local variables, and reference variables.

Now how does it used in computer, we will have to implement a function call in it, I will take the example of the factorial function.

*Figure 33: factorial function*

Let's walk through an example using factorial (5) to understand how the call stack operates during recursive calls:

- The initial call factorial (5) is added to the call stack.
- Since 5 is not equal to 1, the function triggers a recursive call to factorial (4), and factorial (4) is added to the call stack.
- Similarly, factorial (4) triggers a recursive call to factorial (3), and factorial (3) is added to the call stack.
- Again, factorial (3) triggers a recursive call to factorial (2). factorial (2) is added to the call stack.
- Continuing the pattern, factorial (2) triggers a recursive call to factorial (1). factorial (1) is added to the call stack.

*Figure 34: Stack visualization*

Now that n === 1, we're ready to start completing each of the function calls on the call stack:

- factorial (1) is, of course, our base case. Thus, we return 1.
- The value of 1 is returned to the previous function call, factorial (2).
- factorial (2) multiplies the result (1) with the current value of n (2), resulting in 2.
- The value of 2 is returned to the previous function call, factorial (3).
- factorial (3) multiplies the result (2) with the current value of n (3), resulting in 6.
- Similarly, this process continues, and each subsequent function call receives the result of the previous call multiplied by the current n value.
- Eventually, the initial call, factorial (5), receives the result of 24 from factorial (4), multiplies it by n (5), and returns our final value of 120.

*Figure 35: Stack visualization*

The call stack grows as recursive function calls are made and begins to unwind as each function completes its execution. The base case acts as the stopping condition, allowing the stack to unwind gradually.

---

### Specify the abstract data type for a software stack using an imperative definition.

- An ADT (Abstract Data Type) is a way to describe a data structure by what it does, not how it is implemented. It defines the set of values and the operations allowed on them, such as insert, delete, search, or get.
- An imperative definition describes an ADT in terms of step-by-step operations and how the data changes over time. It focuses on the procedure used to perform each operation, usually using assignments, loops, and mutable state.

**Example: Stack ADT using the imperative approach**

#### A stack supports:

- **push(x):** add an element to the top
- **pop():** remove and return the top element
- **top():** return the top element without removing it
- **isEmpty():** check whether the stack is empty

#### Imperative definition:

- Store the stack in an array or list.
- Keep a variable **topIndex** to track the top position.
- **push(x)** increases **topIndex** and writes x there.
- **pop()** returns the element at **topIndex** and decreases **topIndex.**
- **isEmpty()** checks whether **topIndex** is -1.

#### Pseudocode:

```
Initialize stack array
topIndex = -1

push(x):
    topIndex = topIndex + 1
    stack[topIndex] = x

pop():
    if topIndex == -1:
        error "Stack is empty"
    value = stack[topIndex]
    topIndex = topIndex - 1
    return value
```

#### Advantages of imperative definition:

- Very clear and concrete: it shows exactly how each operation works step by step.
- Easy to implement: programmers can turn the definition into code directly.
- Good for debugging: because the state changes are explicit, errors are easier to trace.
- Efficient control over memory and time: you can manage variables, loops, and updates precisely.
- Matches real programming languages: languages like Java, C, and Python often use imperative style.

#### Practical applications:

- Stacks and queues in memory management and task scheduling.
- Banking systems for updating balances, transfers, and transaction records.
- Inventory systems for adding, removing, and searching products.
- Game development for updating player states, scores, and movement.
- Operating systems for process control and resource allocation.

For example, a stack ADT is used in undo operations in text editors and browser back history.

---

#### Example stack implementation using array — Push () - Adds an item to the stack.

- First, we will create a Node class so we can push it into the stack.

*Figure 36: Node class*

- We will then create another class and initialize our array with 2 variables being top and max. Then we will use constructor to initialize the Stack with the stack being empty at -1 since the index of an array start at 0.

*Figure 37: Initialize the stack*

- Then we have 2 operations to check if the stack is either empty or it's full.

*Figure 38: Stack validation*

- After that we will have our push operation. It will check if the stack is full or not, if its not then the top value is increased then the new value will be the one on top.

*Figure 39: Push operation*

---

#### Pop() - Removes an item from the stack. The items are popped in the reversed order in which they are pushed.

- Then coming up next which is our pop operation. It will check if its empty or not if its not empty then it will make the node below the top then minus the top counter by 1.

*Figure 40: Pop operation*

- Then we will implement the code into main function. We will create a "ms" with data type of MyStack then we can use its operation we created. Now I will push some data in and test if it is working properly.

*Figure 41: Main function*

*Figure 42: Print function*

- As you can see this is our output, since I set my stack at 5 is max and tried to push a new node with a value of '6' it says that the Stack is full. After that I pop the stack twice and print again and it pop out the data that got pushed in the latest.

*Figure 43: Output*

---

### Compare the performance of two sorting algorithms.

#### Overview of sorting algorithms

- Sorting algorithms arrange data in a specific order, usually ascending or descending.
- Two common examples are:
  - Bubble Sort: simple but slow on large data.
  - Merge Sort: more advanced and much faster for large data.

#### Description of the two algorithms

**Bubble Sort**

Bubble sort repeatedly compares neighboring elements and swaps them if they are in the wrong order. After each pass, the largest unsorted element moves to the end.

Idea: keep "bubbling" the biggest value to the right.

**Time complexity:**
- Best: **O(n)** if already sorted with optimization
- Average: **O(n²)**
- Worst: **O(n²)**

---

**Merge Sort**

Merge sort uses divide and conquer:
- Split the array into two halves.
- Sort each half recursively.
- Merge the two sorted halves.

**Time complexity:**
- Best: **O(n log n)**
- Average: **O(n log n)**
- Worst: **O(n log n)**

This is the table compare between bubble sort and merge sort:

| **Feature** | **Bubble Sort** | **Merge Sort** |
|---|---|---|
| Speed | Slow | Fast |
| Best for | Very small or nearly sorted data | Large data sets |
| Time complexity | O(n²) | O(n log n) |
| Memory usage | Low | Higher, needs extra space |
| Ease of implementation | Very easy | More complex |
| Stability | Stable | Stable |

#### Main performance difference

- Bubble sort becomes very slow when the input size grows.
- Merge sort stays efficient even for large arrays because its growth rate is much lower.

**For example:**
- 1,000 elements: bubble sort is already much slower
- 100,000 elements: bubble sort is impractical, merge sort still works well

- This is the code for the bubble sort

*Figure 44: Bubble sort code*

- This is the code for the merge sort

*Figure 45: Merge sort initialization*

*Figure 46: Merge sort splitting*

*Figure 47: Merge sorting*

*Figure 48: Merge sort*

- This is the main function for running the code above.

*Figure 49: Main function*

- This the output for the code above.

*Figure 50: Output*

---

### Examine the advantages of encapsulation and information hiding when using an ADT.

#### Abstract Data Type (ADT)

- An ADT is a data model that defines what operations are possible and what the behavior should be, without saying how the data is stored or implemented.

#### Encapsulation

- Encapsulation means putting data and the methods that operate on it together inside one unit, and limiting direct access to the internal state.

#### Information hiding

- Information hiding means hiding the internal details of how the ADT works, while exposing only the necessary operations through a public interface.

#### Benefits of encapsulation and information hiding when using ADTs

Encapsulation and information hiding make ADTs much easier and safer to use.

They help by:
- Protecting data from invalid or accidental changes.
- Reducing complexity because users only see the operations they need.
- Improving maintainability since implementation can change without affecting code that uses the ADT.
- Supporting reusability because the same ADT can be used in many programs.
- Making debugging easier because data is controlled through a small set of methods.
- Improving reliability by enforcing rules inside the ADT.

#### Example: Stack ADT

A stack ADT usually supports:
- push(x) → add an item
- pop() → remove the top item
- peek() → view the top item
- isEmpty() → check whether the stack is empty

The user of the stack does not need to know whether the stack is implemented using:
- an array,
- a linked list,
- or another structure.

*Figure 51: Example of Stack ADT*

Here:
- data and top are hidden
- the user can only use the public methods
- this is both encapsulation and information hiding

#### Comparison before and after applying encapsulation and information hiding

| **Aspect** | **Before** | **After** |
|---|---|---|
| Data access | Internal data can be modified directly | Data is controlled through methods |
| Safety | Easy to break rules or create invalid states | Rules are enforced inside the ADT |
| Complexity | Users must understand internal details | Users only see the interface |
| Maintenance | Changing implementation may break other code | Internal changes are hidden from users |
| Reusability | Harder to reuse cleanly | Easier to reuse in different programs |
| Debugging | More errors from direct manipulation | Fewer errors because access is controlled |

---

### Analyse the operation, using illustrations, of two network shortest path algorithms, providing an example of each.

A shortest path problem asks: given a weighted graph G = (V, E), find the minimum-cost path between a source vertex s and a target vertex t (or all other vertices). Weights on edges represent costs such as distance, time, or bandwidth. The problem has two main variants:

- Single-source: Find shortest paths from one source to all other vertices.
- All-pairs: Find shortest paths between every pair of vertices.

Both Dijkstra's and Bellman-Ford solve the single-source variant, but differ critically in what kinds of graphs they handle.

The shortest path algorithms are the ones that focuses on calculating the minimum travelling cost from source node to destination node of a graph in optimal time and space complexities.

#### a, Dijkstra's algorithm

- Dijkstra's algorithm finds the shortest path from a source to all other nodes, but only when all edge weights are non-negative.
- It grows a set of "finalized" nodes, always choosing the node with the smallest tentative distance next.

**How it works:**
- Set the source distance to 0.
- Set all other distances to infinity.
- Repeatedly pick the unvisited node with the smallest known distance.
- Relax its outgoing edges:
  - if going through this node gives a shorter path to a neighbor, update that neighbor.
- Continue until all nodes are processed.

*Figure 52: weighted graph*

**Example for the graph above:**

- First, we set all the node's cost to infinity and our starting point is A to 0

```
A = 0
B = ∞
C = ∞
D = ∞
E = ∞
F = ∞
```

- From A we can access to B and C, so we update our table

```
A = 0
B = 4
C = 2
D = ∞
E = ∞
F = ∞
```

- Then we take the path that has the lowest cost which is C, at C we can access to the E node, so lets update our table again

```
A = 0
B = 4
C = 2
D = ∞
E = 5
F = ∞
```

- After that we will take the Node E which is the node with the lowest cost again, at the E node we can access node D, so let's update our table again

```
A = 0
B = 4
C = 2
D = 9
E = 5
F = ∞
```

- Again, we will access to the lowest cost node which is D, and at D we can access to node F so let's update our table again

```
A = 0
B = 4
C = 2
D = 9
E = 5
F = 20
```

- So now we have all the shortest path from node A to other node which is:

```
A -> B = 4
A -> C = 2
A -> D = 9
A -> E = 5
A -> F = 20
```

**Best Time Complexity of Dijkstra's Algorithm:** O((V + E) log V)

**Average Case Time Complexity:** O((V + E) log V)

**Worst Case Time Complexity:** O((V²) log V)

**Space Complexity of Dijkstra's Algorithm:** O(V)

**Core Details:**

**Edge Weights:** It only works correctly with non-negative weights. If a graph contains negative cycles, it will produce incorrect results (the Bellman-Ford algorithm should be used instead for graphs with negative weights).

**Applications:** GPS and navigation systems (like Google Maps), network routing protocols (OSPF), and game development (A.I. movement tracking).

---

#### b, Bellman-Ford algorithm

Bellman-Ford (1958) is a dynamic programming algorithm that handles graphs with negative edge weights and can detect negative-weight cycles. Rather than greedily extracting vertices, it iteratively relaxes all edges, up to |V|−1 times.

**How it works:**
- Set the source distance to 0, others to infinity.
- Relax every edge in the graph V − 1 times, where V is the number of vertices.
- Do one extra pass:
  - if any distance still improves, a negative cycle exists.

For example, let's take a look at this graph. We have a total of 5 nodes starting from 0.

*Figure 53: weighted graph*

- First, we have a table listing all the costs then we will apply the Bellman-Ford algorithm.

```
0 = 0
1 = ∞
2 = ∞
3 = ∞
4 = ∞
```

- Applying the Bellman-Ford algorithm we will do a iteration for every node except unknown node, from our node 0 we can go to node 1 so lets update our table

```
0 = 0
1 = 5
2 = ∞
3 = ∞
4 = ∞
```

- Then at node 1 we can go to node 2 and 3 so we will note that to our table

```
0 = 0
1 = 5
2 = 6
3 = 7
4 = ∞
```

- Since there is no accessible node at node 3, we will go to node 2 next, and at node 2, we can access to node 4 so we will update our table again.

```
0 = 0
1 = 5
2 = 6
3 = 7
4 = 7
```

- Now going to the node 4, we can see that there is a negative path reaching to 3 making it faster so we will update our table again

```
0 = 0
1 = 5
2 = 6
3 = 6
4 = 7
```

- Now we have done our first iteration, let's move on to the second one. We will do from the starting point again with our updated value.
- But since this graph is kind of small and close ended, the second iteration does not update the table value and because of that the loop is done since no further value that cost is lower can be updated.

---

### Discuss the view that imperative ADTs are a basis for object orientation offering a justification for the view.

**Definition of concepts**

- An Abstract Data Type (ADT) is a logical model of a data structure defined by its behavior rather than its implementation. It specifies what operations are available and what those operations do, but not how they are carried out internally.
- An imperative ADT is an ADT whose operations are performed by changing state. It uses commands such as insert, delete, update, and retrieve, and the data structure's contents may change after each operation.
- Object-oriented programming (OOP) is a programming paradigm built around objects, where each object combines data and methods that operate on that data. OOP emphasizes encapsulation, abstraction, inheritance, and polymorphism.

#### Role of imperative ADTs in OOP

Imperative ADTs fit naturally into OOP because both are concerned with encapsulating state and operations together. A class in OOP often behaves like an implementation of an ADT:
- the class hides internal representation,
- the public methods define the allowed operations,
- the object maintains mutable state,
- users interact with the object through a controlled interface.

For example, a Stack class in OOP is usually an implementation of the stack ADT. The user can push, pop, and peek, but does not need to know whether the stack is stored in an array or a linked list.

#### Discussion: ADTs as the foundation of OOP

The view that imperative ADTs are a basis for object orientation is strongly justified.

**First**, OOP depends on the same core idea as ADTs: separating interface from implementation. An ADT describes the operations and the rules of use; OOP classes expose methods that define that interface. This makes OOP a natural extension of ADT thinking.

**Second**, imperative ADTs already include stateful behavior, which is central to objects. An object is essentially a stateful entity whose methods modify or query its state. That is very close to how imperative ADTs work.

**Third**, encapsulation in OOP is almost a direct implementation of ADT principles. Internal data is hidden, and only valid operations are exposed. This reduces errors, improves maintainability, and makes it possible to change implementation without affecting users of the abstraction.

However, it is also fair to say that ADTs are not the whole of OOP. OOP goes further by adding:
- inheritance, which supports code reuse and hierarchical classification,
- polymorphism, which allows different objects to be used through a common interface,
- dynamic binding, which lets the exact method used be decided at runtime.

So, the best conclusion is that imperative ADTs provide the conceptual foundation for the abstraction and encapsulation parts of OOP, but OOP expands beyond ADTs into a richer programming model.

#### Practical example — Consider a bank account.

As an imperative ADT, the bank account supports operations such as:
- deposit(amount)
- withdraw(amount)
- getBalance()

The user does not need to know how the balance is stored internally. The important thing is that the balance changes in a controlled way through the allowed operations.

In OOP, this becomes a BankAccount class:

*Figure 54: BankAccount class*

**Here**, the class acts like an imperative ADT:
- the state is the balance,
- the operations are deposit, withdraw, and getBalance,
- the internal representation is hidden through private balance.

This shows how imperative ADTs provide the structural idea behind objects in OOP.

---

## CONCLUSION

---

## REFERENCES

GeeksforGeeks (2024). *Singly Linked List Tutorial*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/singly-linked-list-tutorial/

GeeksforGeeks (2018). *Deletion at beginning (Removal of first node) in a Linked List*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/remove-first-node-of-the-linked-list/

GeeksforGeeks (2024). *Traversal of Singly Linked List*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/traversal-of-singly-linked-list/

GeeksforGeeks (2024). *Implement Stack using Array*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/implement-stack-using-array/

GeeksforGeeks (2022). *Introduction to Queue Data Structure*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/introduction-to-queue-data-structure-and-algorithm-tutorials/

GeeksforGeeks (2009). *Level Order Traversal (Breadth First Search or BFS) of Binary Tree*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/level-order-tree-traversal/

GeeksforGeeks (2022). *Introduction to Stack memory*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/operating-systems/introduction-to-stack-memory/

Launchschool.com. (2025). *Call Stack in Recursive Algorithms: A Deep Dive*. [online] Available at: https://launchschool.com/books/advanced_dsa/read/exploring_call_stack

GeeksforGeeks (2023). *Shortest Path Algorithm Tutorial with Problems*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/shortest-path-algorithms-a-complete-guide/

GeeksforGeeks (2012). *Bellman–Ford Algorithm*. [online] GeeksforGeeks. Available at: https://www.geeksforgeeks.org/dsa/bellman-ford-algorithm-dp-23/