package DataStructures;

public class Linked_List {
    // Variable Size and non-contiguous memory
    // Insert: O(1)
    // Search: O(n)

    public Node head;
    private int size;

    public Linked_List(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this .next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        // Insert Node- First, last
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");

        // Print LinkedList
        list.printList();

        // Delete Node
        list.deleteFirst();
        list.deleteLast();

        list.printList();

        // Size of LinkedList
        System.out.println(list.getSize());

        // Reverse LinkedList
        Linked_List list1 = new Linked_List();
        list1.addLast("1");
        list1.addLast("2");
        list1.addLast("3");
        list1.addLast("4");
        list1.printList();

//        list1.reverseIterate();
        list1.head = list1.reverseRecursive(list1.head);
        list1.printList();

    }
}
