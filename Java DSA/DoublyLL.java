public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

    //Add First in DLL
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //Remove First in DLL
    public void removeFirst(){
        if(head == null){
            System.out.print("DLL is Empty: ");
        } 
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Removing Node: " + val);
    }
    //Add Last in DLL
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    //Remove last in DLL
    public void removeLast(){
        if (head == null) {
            System.out.println("DLL is Empty");
            return;
        }
        int val = tail.data;
        System.out.println("Removing Node: " + val);
        tail = tail.prev;
        tail.next = null;
        size--;
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
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addLast(6);
        dll.addLast(7);
        dll.print();
        System.out.println("Size: " + size);
        dll.removeLast();
        dll.print();
        System.out.println("Size: " + size);
    }
}
