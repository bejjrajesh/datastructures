package stack.array;

public class ArrayStackMain {

    public static void main(String[] args){

        ArrayStack arrayStack = new ArrayStack(5);

        System.out.println("is Stack empty : " + arrayStack.isStackEmpty());
        arrayStack.push(100);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(200);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(300);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(400);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        arrayStack.push(500);
        System.out.println("Top of the stack is : "+arrayStack.peek());
        System.out.println("is stack full : " + arrayStack.isStackFull());
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
