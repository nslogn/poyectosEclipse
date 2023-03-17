package dp;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<>();

		list.add(new Node("A"));
		list.add(new Node("B"));
		list.add(new Node("C"));
		list.add(new Node("D"));
		list.add(new Node("E"));
		list.add(new Node("F"));
		list.add(new Node("G"));
		
		
	}
	
	public void dps(Node n) {
// DPs implementation. Assuming the first node in the adjacent list is the first dp has to visit.
		Stack<Node> stack = new Stack<>();
		n.setIsvisited(true);
		stack.add(n);
		
		while(!stack.isEmpty()) {

		}
	}
	
}
