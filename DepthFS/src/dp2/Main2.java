package dp2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main2 {
	
	    private Map<Integer, List<Integer>> graph;
	    private boolean[] visited;
	    private Stack<Integer> stack;

	    public Main2(Map<Integer, List<Integer>> graph) {
	        this.graph = graph;
	        visited = new boolean[graph.size()];
	        stack = new Stack<>();
	    }

	    public void dfs(int start) {
	        visited[start] = true;
	        stack.push(start);

	        while (!stack.isEmpty()) {
	            int current = stack.pop();
	            System.out.print(current + " ");

	            for (int neighbor : graph.get(current)) {
	                if (!visited[neighbor]) {
	                    visited[neighbor] = true;
	                    stack.push(neighbor);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Map<Integer, List<Integer>> graph = new HashMap<>();
	        graph.put(0, Arrays.asList(1, 2));
	        graph.put(1, Arrays.asList(0, 3));
	        graph.put(2, Arrays.asList(0, 3, 4));
	        graph.put(3, Arrays.asList(1, 2, 4));
	        graph.put(4, Arrays.asList(2, 3));
	        Main2 dfs = new Main2(graph);
	        dfs.dfs(4);
	    }

}
