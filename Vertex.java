import java.util.ArrayList;

public class Vertex {
	// Stores all edges that can be accessed from the vertex
	ArrayList<Edge> edgeList = new ArrayList<Edge>();
	private char name;
	
	// Does nothing since edges are added after the object is created
	Vertex(char name){	
		this.name = name;
	}
	
	public char getName() {
		return name;
	}
	
	// Adds an edge to edgeList
	public void addEdge(Edge e) {
		edgeList.add(e);
	}
	
	// Returns the Edge for the corresponding input
	public Edge getEdge(char input) {
		Edge hold = null;
		for (int i = 0; i < edgeList.size(); i++) {
			if (edgeList.get(i).input == input) {
				hold = edgeList.get(i);
			}
		}
		return hold;
	}
}
