public class LLremoveNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add First in Linked List
    public void addFirst(int data){
        Node newNode = new Node(data);
        size += 1;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //remove first in Linked List
    public int removeFirst(){
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        System.out.print("Removed: ");
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove Last in Linked List
    public int removeLast(){
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        System.out.print("Removed: ");
        int val = tail.data;
        //tarverse till tail node
        Node temp = head;
        int i = 0;
        while (i < size-2) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        return val;
    }

    //Printing Linked List
    public void printLL(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LLremoveNode ll =new LLremoveNode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Linked List Size: " + size);
        ll.printLL();
        System.out.println(ll.removeFirst());
        ll.printLL();
        System.out.println(ll.removeLast());
        ll.printLL();
    }
}

/*Output: 
Linked List Size: 5
1 -> 2 -> 3 -> 4 -> 5 -> null
Removed: 1
2 -> 3 -> 4 -> 5 -> null
Removed: 5
2 -> 3 -> 4 -> null
*/