package LinkedListUserdefined;

public class LL {
    private Node head;
    private Node tail;
    int size = 0;
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void insertFirst(int value){
        if(head == null){
            insert(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }
    public void insertAt(int pos, int value){
        if(head == null){
            insert(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("List is empty then how you will delete...");
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }
    public Node get(int size){
        Node temp = head;
        for(int i=1;i<size;i++){
            temp = temp.next;
        }
        return temp;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int value = tail.value;
        Node lastPrev = get(size-2);
        tail = lastPrev.next;
        tail.next = null;
        size--;
        return value;
    }
    public int delete(int pos){
        if(pos == 0)
            return deleteFirst();
        else if(pos == size - 1){
            return deleteLast();
        }
        Node node = get(pos - 1);
        int value = node.next.value;
        node.next = node.next.next;
        return value;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->" );
            temp = temp.next;
        }
        System.out.println("null");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this(value);
            this.next = next;
        }
    }
}
