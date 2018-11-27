
public class Edge {
	// Input that allows traversal from one vertex to another
	char input;
	// 2 ends of the Edge
	Vertex startV;
	Vertex endV;
	
	Edge(char input, Vertex startV, Vertex endV){
		this.input = input;
		this.startV = startV;
		this.endV = endV;
		
		// Adds the Edge to each of the Vertexes
		startV.addEdge(this);
	}
}
