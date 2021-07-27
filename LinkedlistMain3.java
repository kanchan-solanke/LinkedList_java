class LinkedList1 {
    Node head;  // head of list      //1st value

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {                             // constructor
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* Allocate the Node &                           //push method
                  Put in the data*/
        Node new_node = new Node(new_data);

        // Make next of new Node as head
        new_node.next = head;

        // Move the head to point to new Node
        head = new_node;            //assign address
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data) {
        // Check if the given Node is null
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        //Allocate the Node &   Put in the data
        Node new_node = new Node(new_data);      //data value and address pointer

        //Make next of new Node as next of prev_node
        new_node.next = prev_node.next;             // for address first_node= second_node(address)

        // make next of prev_node as new_node
        prev_node.next = new_node;                 // second_data = next new data
    }

    public void append(int new_data) {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);

        // If the Linked List is empty, then make th new node as head (70)
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        /*  This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;

        /*  Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* Change the next of last node */
        last.next = new_node;
        return;
    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList1 llist = new LinkedList1();

        // Insert 70.  So linked list becomes 70->NUllist
        llist.append(70);               //display

        // Insert 30 at the beginning. So linked list becomes
        llist.push(30);

        // Insert 56 at the beginning. So linked list becomes
        // 56->30->70->NUllist
        llist.push(56);

        System.out.println("Created Linked list is: ");
        llist.printList();
    }
}