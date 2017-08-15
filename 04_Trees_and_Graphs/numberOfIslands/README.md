**Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.**

## Solution (Recursive)
- Start at the first land vertex
- DFS and mark all the parts of the single island
- DFS terminates after marking all the regions of the current island.
- increment the island count and go to next land portion.
- go to step 2 and repeat until all the land regions are discovered. 
- You can also visited boolean array as flag to mark the visited land regions. 
