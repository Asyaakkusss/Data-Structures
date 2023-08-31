
public class SinglyLinkedList<T> {

    Node<T> first_node; 

    public SinglyLinkedList() {
        this.first_node = null; 
    }

    public void insert_node_at_back (T inserted_value) {
        Node<T> new_node = new Node<T>(inserted_value); 
        
        if (first_node == null)
            first_node = new_node; 
        else {
            Node<T> ptr = null; 
            while (ptr.next_node != null) {
                ptr = ptr.next_node; 
            }
            ptr.next_node = new_node; 
        }
    }

    public void insert_node_at_front (T inserted_value) {
        Node<T> new_node = new Node<T>(inserted_value); 
        Node<T> previous_first_node = new Node<T>(first_node.node_contents); 
        if (first_node == null)
            first_node = new_node; 
        else {
            first_node = new_node; 
            first_node.next_node = previous_first_node; 
        }
    }

}