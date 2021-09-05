public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if(head == null) {
            System.out.println("List is empty");
            
        } else {
            Node runner = head;
            if(runner.next == null){
                head = null;
            }
            else{
                // Make 2 runners.  One for finding the end and the second for
                // finding the second to last.
                Node runner1 = head;
                Node runner2 = head;
            while(runner1.next != null) {
                // Set runner2 equal to runner 1 as long as runner 1 isn't at the
                // last spot which would have a null next
                runner2 = runner1;
                runner1 = runner1.next;
            }
            // set the second to last items next to null
            runner2.next = null;
            }
        }
    }

    public void deleteNodeAt(int value) {
        if(head == null) {
            System.out.println("List is empty");
        }else if(head.value == value){
            // For deleting item if it's the head node.
            System.out.println("Node with value " + value + "is the head node");
            head = head.next;
        } else {
            Node previousToNodeToDelete = head;
            Node nodeToDelete = head.next;
            while(nodeToDelete.value != value){
                previousToNodeToDelete = nodeToDelete;
                nodeToDelete = nodeToDelete.next;
            }
            // Set pointer from item previous to the node to delete equal 
            // to the node to deletes next item bypassing the node to delete
            previousToNodeToDelete.next = nodeToDelete.next;
        }
    }

    // public Node findNodeAt(int value){
    //     if(head == null) {
    //         System.out.println("List is empty");
    //     } else if (head.value == value) {
    //         return head;
    //     }else {
    //         Node nodeFinder = head;
    //         while(nodeFinder.value != value){
    //             nodeFinder = nodeFinder.next;
    //         }
    //         System.out.println("I have found the item with value: " + nodeFinder.value);
    //         return nodeFinder;
    //     }

    // }


    public void printValues() {
        Node current = head;
        if(head == null){
            System.out.println("No values to print");
            return;
        }
        int counter = 0;
        while(current != null) {
            if(counter==0){
                System.out.println("Head Node's Value is :" + current.value);
            }else {
                System.out.println("Node at position " + counter + "'s Value is :" + current.value);
                current = current.next;
            }
            counter ++;
        }
        System.out.println();
    }

}