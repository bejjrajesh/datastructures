package datastructures.linear.stack.array;

public class ArrayStackMain {

    public static void main(String args[]){
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(100);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(200);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(400);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(500);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.pop();
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.pop();
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.pop();
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.pop();
        System.out.println("Top of the stack is : "+arrayStack.peek());
        System.out.println("Is stack Empty ? : "+arrayStack.isStackEmpty());
    }
}
