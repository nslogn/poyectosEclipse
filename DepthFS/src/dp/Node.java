package dp;

import java.util.LinkedList;

public class Node {
	protected boolean visited;
	protected String name;
	LinkedList<Node> adjacents ;
	
	public Node(String name ) {
		this.visited = false;
		this.name = name;
		this.adjacents = new LinkedList<>();
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setIsvisited(boolean visited) {
		this.visited = visited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void connect(Node n) {
		this.adjacents.addLast(n);
	}
	public void addAdjacent(Node n) {
		this.adjacents.add(n);
	}
	public boolean isConnected() {
		//Returns true if the adjacent list is not empty
		if(this.adjacents.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
