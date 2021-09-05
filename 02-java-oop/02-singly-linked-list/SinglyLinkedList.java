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
                Node runner1 = head;
                Node runner2 = head;
            while(runner1.next != null) {
                runner2 = runner1;
                runner1 = runner1.next;
            }
            runner2.next = null;
            
            }
        }
        
    }

    public void printValues() {
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.println(current.value + "");
            current = current.next;
        }
        System.out.println();
    }

}