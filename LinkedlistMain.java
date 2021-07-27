public class LinkedlistUC5 {

    private static Node head;
    //Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedlistUC5 insert(LinkedlistUC5 list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedlistUC5 list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    private static void deleteFirstNode() {
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedlistUC5 list = new LinkedlistUC5();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 56);
        list = insert(list, 30);
        list = insert(list, 70);


        // Print the LinkedList
        printList(list);

        list.remove(list, 56);

        printList(list);
    }

    private void remove(LinkedlistUC5 list, int data) {
        Node temp = head;
        head = head.next;
        temp.next = null;
    }


}