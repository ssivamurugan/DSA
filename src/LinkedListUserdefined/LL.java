package LinkedListUserdefined;

public class LL<T> {
    private Node head;
    private Node tail;
    int size = 0;


    public void insert(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }


    public void insertFirst(T value) {
        if (head == null) {
            insert(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }


    public void insertAt(int pos, T value) {
        if (head == null) {
            insert(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }


    public T deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, cannot delete.");
            return null;
        }
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }


    public Node get(int size) {
        Node temp = head;
        for (int i = 1; i < size; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public T deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        T value = tail.value;
        Node lastPrev = get(size - 2);
        tail = lastPrev.next;
        tail.next = null;
        size--;
        return value;
    }


    public T delete(int pos) {
        if (pos == 0) {
            return deleteFirst();
        } else if (pos == size - 1) {
            return deleteLast();
        }
        Node node = get(pos - 1);
        T value = node.next.value;
        node.next = node.next.next;
        size--;
        return value;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this(value);
            this.next = next;
        }
    }
}
