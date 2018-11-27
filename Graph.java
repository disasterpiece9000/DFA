import java.util.ArrayList;
import java.util.Collection;

public class Graph {
	// Start state of DFA
	Vertex startState;
	// Current state in traversal
	Vertex currentState;
	// List of all accepting states
	ArrayList<Vertex> acceptingStates = new ArrayList<Vertex>();
	
	
	Graph(ArrayList<Vertex> acceptingStates, Vertex startState){
		this.startState = startState;
		// Initially sets the current state to the start state
		currentState = startState;
		this.acceptingStates = acceptingStates;
		System.out.println("Graph generated");
	}
	
	// Accepts an input and changes the current state accordingly
	public boolean traverseGraph(char input) {
		Edge currentEdge = currentState.getEdge(input);
		currentState = currentEdge.endV;
		
		// If the current state is an accepting state it returns True, otherwise it returns False
		if (acceptingStates.contains(currentState)) {
			return true;
		}
		else {
			return false;
		}
	}
}
