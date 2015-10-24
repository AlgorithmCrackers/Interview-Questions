You are given a list of projects and a list of dependencies. All of a project's dependencies must be built before the project is. Find a build order that will allow the projects to be built. If there is no valid build order return an error.

## Example
```
projects: a, b, c, d, e, f
dependencies: (f, b), (f, c), (f, a), (b, e), (a, e), (d, e)
```

## Solution 

Use **topological sort**,
  -  It is the reverse of DFS finishing times

To find invalid build error,
  - Find if the graph has a backedge while doing DFS. 

## Result
```
[f, d, g, c, b, a, e]
```
