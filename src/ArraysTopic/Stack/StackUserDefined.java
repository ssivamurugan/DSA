package ArraysTopic.Stack;

public class StackUserDefined {
    private int[] stack;
    private int maxSize;
    private int top;
    // To initialize array stack
    StackUserDefined(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        this.stack = new int[maxSize];
    }
    // To check array is Full (to avoid array index outoff bound)
    public boolean isFull(){
        if(top == (maxSize - 1))
            return true;
        return false;
    }
    // To check array is Empty (to avoid array index outoff bound)
    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }
    public void push(int ele){
        if(isFull())
            System.out.println("Stack is Full...");
        else{
            top++;
            stack[top] = ele;
        }
    }
    public void pop(){
        if(isEmpty())
            System.out.println("Stack is Emepty, So unable to delete...");
        else{
            System.out.println(stack[top] + " was deleted...");
            top--;
        }
    }
    public int peek(){
        return stack[top];
    }
    public static void main(String[] args){
        StackUserDefined stack = new StackUserDefined(5);
        stack.push(5);
        stack.push(99);
        stack.push(61);
        stack.push(34);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
