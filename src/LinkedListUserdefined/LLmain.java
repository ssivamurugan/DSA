package LinkedListUserdefined;

public class LLmain {
    public static void main(String[] args){
        LL<Integer> ll = new LL<>();
        ll.insert(7);
        ll.insert(3);
        ll.insert(9);
        ll.insert(4);
        ll.insert(5);
        ll.insertFirst(99);
        ll.insertAt(4, 33);
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        System.out.println(ll.deleteLast());
        System.out.println(ll.delete(2));
        ll.display();
    }
}
