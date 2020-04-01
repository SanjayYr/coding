// @file: DSAlgosShort.java

DFS, BFS runtime -    O(E+V), E is O(V^2)
  
Dijkstra and Prims are similar with sptSet(dist[]) and mstSet(keys[])
  
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






