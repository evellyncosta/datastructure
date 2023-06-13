package linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else if (length == 1) {
                tail = newNode;
                head.next = newNode;
                newNode.prev = head;
        }else{
            Node nodeBeforeTail = tail.prev;
            nodeBeforeTail.next = newNode;
            newNode.prev = nodeBeforeTail;
            tail = newNode;
        }

        length++;
    }

    public void removeLast(){
        if (length == 0) return;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
    }


    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);;
    }



}
