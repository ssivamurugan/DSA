package ArraysTopic.Stack;

public class StackUserDefined {
    private int[] stack;
    private int maxSize;
    private int top;

    // To initialize array stack
    StackUserDefined(int maxSize){
        this.maxSize = maxSize;
        this.top = 0;
        this.stack = new int[maxSize];
    }

    // To check if array is full (to avoid array index out of bounds)
    public boolean isFull(){
        return top == maxSize;
    }

    // To check if array is empty (to avoid array index out of bounds)
    public boolean isEmpty(){
        return top == 0;
    }

    public void push(int ele){
        if(isFull())
            System.out.println("Stack is Full...");
        else{
            stack[top] = ele;
            top++;
        }
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Stack is Empty, So unable to delete...");
        else{
            top--;
            System.out.println(stack[top] + " was deleted...");
        }
    }

    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[top - 1];
    }

    public static void main(String[] args){
        StackUserDefined stack = new StackUserDefined(5);
        stack.push(5);
        stack.push(99);
        stack.push(61);
        stack.push(34);
        stack.push(27);
        System.out.println(stack.peek());
    }
}
