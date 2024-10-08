package ArraysTopic.Queue;

public class UserDefinedQueue {
    private int maxSize;
    private int front;
    private int rear = -1;
    private int queue[];
    UserDefinedQueue(int maxSize){
        this.maxSize = maxSize;
        this.front = 0;
        this.queue = new int[maxSize];
    }
    public boolean isFull(){
        return rear == maxSize-1;
    }
    public boolean isEmpty(){
        return front == maxSize-1 || rear == -1;
    }
    public void enqueue(int ele){
        if(isFull())
            throw new ArrayIndexOutOfBoundsException("Queue is full...");
        rear++;
        queue[rear] = ele;
    }
    public int dequeue(){
        if(isEmpty())
            throw new ArrayIndexOutOfBoundsException("Arrays is empty unable to delete...");
        return queue[front++];
    }
    public static void main(String[] args){
        UserDefinedQueue queue = new UserDefinedQueue(5);
        queue.enqueue(5);
        queue.enqueue(99);
        queue.enqueue(61);
        queue.enqueue(34);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
