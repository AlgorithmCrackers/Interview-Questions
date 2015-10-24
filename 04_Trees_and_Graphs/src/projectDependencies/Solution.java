package projectDependencies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

class Graph {
	private Map<Object, Set<Object>> adj;
	private int V;
	private int E;
	public Graph() {
		adj = new HashMap<Object, Set<Object>>();
	}
	public void addDirectedEdge(Object from, Object to) {
		if(! adj.containsKey(from)) {
			adj.put(from, new HashSet<Object>());
			V++;
		}
		adj.get(from).add(to);
		E++;
	}
	public int getV() {
		return V;
	}
	public int getE() {
		return E;
	}
	public Set<Object> getAdj(Object v) {
		return adj.get(v);
	}
	public Set<Object> getVertices() {
		return adj.keySet();
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		String NEWLINE = System.getProperty("line.separator");
		s.append(V + " vertices, " + E + " edges " + NEWLINE);
		for (Object v: getVertices()) {
			s.append(v + ": ");
			for (Object w : getAdj(v)) {
				s.append(w + " ");
			}
			s.append(NEWLINE);
		}
		return s.toString();
	}
}

public class Solution {
	static class DFS {
		private Map<Object, Object> parent;
		private List<Object> order;
		public DFS() {
			parent = new HashMap<Object, Object>();
			order = new ArrayList<Object>();
		}
		public static DFS dfs(Graph g) {
			DFS results = new DFS();
			for(Object v : g.getVertices()) {
				if (! results.parent.containsKey(v) ) {
					Dfs_visit(g, v, results, null);
				}
			}
			return results;
		}
		private static void Dfs_visit(Graph g, Object v, DFS results, Object parent) {
			results.parent.put(v, parent);
			if (g.getAdj(v) != null) {
				for (Object a: g.getAdj(v)) {
					if(! results.parent.containsKey(a)) { // not visited before
						Dfs_visit(g, a, results, v);
					}
				}
			}
			results.order.add(v);
		}
		public static List<Object> topologicalSort(Graph g) {
			DFS results = dfs(g);
			Collections.reverse(results.order);
			return results.order;
		}
	}
	public static void main(String[] args) {
		Graph g = new Graph();
		g.addDirectedEdge("d", "g");
		g.addDirectedEdge("f", "b");
		g.addDirectedEdge("f", "c");
		g.addDirectedEdge("f", "a");
		g.addDirectedEdge("c", "a");
		g.addDirectedEdge("b", "a");
		g.addDirectedEdge("b", "e");
		g.addDirectedEdge("a", "e");
		System.out.println(Solution.DFS.topologicalSort(g));
	}
}
