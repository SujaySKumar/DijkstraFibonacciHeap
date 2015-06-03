# DijkstraFibonacciHeap

This project was executed as a part of Advanced Data Structures Course in Computer Science and Engineering undergradute course.

This project implements Dijkstra's algorithm using Fibonacci Heaps as the primary data structure as it promises excellent time efficiency.

The algorithm works by maintaining a priority queue of nodes whose priorities are the lengths of some path from the source node to the node in question.  At each step, the algorithm dequeues a node from this priority queue, records that node as being at the indicated distance from the source, and then updates the in the graph by considering all outgoing edges from the recently-dequeued node to those nodes.
In the course of this algorithm, the code makes up to |E| calls to decrease key on the heap (since in the worst case every edge from node will yield a shorter path to some node than before) and |V| calls to dequeue-min (since each node is removed from the priority queue most once). Using a Fibonacci heap, this gives a very good runtime guarantee of O(|E| + |V| log |V|).
