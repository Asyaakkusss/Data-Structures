

public class Node<T> {

    //each node stores two pieces of information, 
    //the contents of the current node and the next node
    T node_contents; 
    Node<T> next_node; 

    //constructor 
    public Node (T node_contents) {
        this.node_contents = node_contents; 
        this.next_node = null; 
    }
}
 