// @file: DSAlgosShort.java
Problem solving patterns:

Two-pointers
Sliding window
HashMap for lookups
HashSet for unique values
Fast and slow pointers
Node manipulation
Binary search
BFS
DFS
Memoization
Recursion
Pre, In, Post order traversal of tree
Recursive and iterative implementations
Use StringBuilder over String for any string manipulations

Look for iterating from last dependending on situation

Binary tree questions iterative solutions related to sum, we can propagate the value down to leaf.

All combinations of something => backtracking problem

Prefix sum
XOR
PriorityQueue for heap related problems

When it comes to shortest step or minimum steps, always have BFS in mind.
Leetcode 854

For array problems, if the TC > O(n2), try to think through solution by sorting the array

For kth largest or smallest, use median of medians method for O(n) TC and heap method for O(nlogn) TC

For contiguous sub-array problems, try to think in terms of sliding window

If a string involves repeated manipulations, convert into char array and manipulate on the char array 


DFS, BFS runtime -    O(E+V), E is O(V^2)
  
Dijkstra's and Prim's are similar with sptSet(dist[]) and mstSet(keys[])

// Shortest path algos
Dijkstra's     - O((E+V)logV) = O(ElogV) positive weights and no cycle
Bellman-Ford   - O(VE), Relax all edges |V|-1 times  => (|V|-1)E 
Floyd-Warshal  - O(V^3), all src-dst paths with k(0-(|V|-2)) intermediate vertices 
Johnson's      - All pair shortest paths, 
  

// MSTs
Prim's - keys[] and choose min. Use TreeSet over PQ as remove() is O(n) in TreeSet

Kruskal's  - mstSet[], sort edges, detect cycle using Union-Find (By Rank and Path-compression)  

DP - Optimal Sustructure, Overlapping Subproblems

Greedy - Fractional Knapsack, 

3D DP with graphs - https://www.geeksforgeeks.org/shortest-path-exactly-k-edges-directed-weighted-graph/

Self-Balancing BSTs - AVL, Red-Black Tree

Optimizing DP using O(n) space instead of O(n^2) space.
  
Use counting sort when range of numbers is limited.
  
Insertion Sort performs well for small arrays

Java and Python sort() uses TimSort

0-1 BFS https://www.geeksforgeeks.org/0-1-bfs-shortest-path-binary-graph/
https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/

Remember to use do-while when required.
 
Updated list of Leetcode problems that involved 1 or 2 passes from left to right/right to left:
53 Maximum Subarray
121 Best Time to Buy and Sell Stock
152 Maximum Product Subarray
238 Product of Array Except Self
739 Daily Temperatures
769 Max Chunks to Make Sorted
770 Max Chunks to Make Sorted II
821 Shortest Distance to a Character
845 Longest Mountain in Array

Collatz Conjecture


