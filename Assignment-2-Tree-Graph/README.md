# EPAM Assignment 2 (Java)

## Problem 1: Tree of Trusted Servers
- Approach: DFS on Tree
- Time Complexity: O(N)

## Problem 2: Emergency Route Validation
- Approach: BFS on Graph
- Time Complexity: O(N + M)

## Files
- TreeOfTrustedServers.java
- EmergencyRouteValidation.java

## Note
For Problem 1, the solution computes the XOR of security keys along the path from the root (Server 1) to each node and counts servers where the path XOR is greater than or equal to K.
