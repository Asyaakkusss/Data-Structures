
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

    public void remove_node_from_back() {
        Node<T> ptr = first_node; 
        while (ptr.next_node != null) {
            ptr = ptr.next_node; 
        }
        ptr = null; 
    }

    public void remove_node_from_front() {
        if (first_node != null) {
            Node<T> new_first = first_node.next_node; 
            if (new_first != null)
                first_node = new_first;
            else 
                first_node = null; 
        }
    }
}