package Day12;

public class LinkedList {
    Node head;

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int getFirst() {
        if (head == null){
            return -1;
        }
        return head.val;
    }

    public int getLast() {
        if (head == null) return -1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.val;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void remove(int data) {
        if(head == null){
            return;
        }
        if(head.val == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.val != data){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    public void removeLast(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(8);
        list.print();

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Size: " + list.size());
        list.remove(2);
        System.out.print("After removing 2: ");
        list.print();
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
