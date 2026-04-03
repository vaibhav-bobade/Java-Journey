public class ReverseDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public  Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    //Reverse DLL function
    public Node reverseDLL(){
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node nextNode;
        Node prevNode = null;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prevNode;
            curr.prev = nextNode;

            prevNode = curr;
            curr = nextNode;
        }
        head = prevNode;
        return head;
    }

    //Print the DLL
    public void print(){
        if (head == null) {
            System.out.println("DLL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();

        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Before Reverse: ");
        dll.print();
        System.out.println("After Reverse: ");
        dll.reverseDLL();
        dll.print();
    }
}

/*Output: 
    Before Reverse:
    1 <-> 2 <-> 3 <-> 4 <-> null
    After Reverse:
    4 <-> 3 <-> 2 <-> 1 <-> null
 */