package stack.linkedlist;

public class LinkedListStackMain {

    public static void main(String[] args){

        LinkedListStack<Integer>  stack = new LinkedListStack<>();
        System.out.println("Is Stack Empty: "+ stack.isEmpty());
        stack.push(100);
        System.out.println("Top of the stack is : "+ stack.peek());
        stack.push(200);
        System.out.println("Top of the stack is : "+ stack.peek());
        stack.push(300);
        System.out.println("Is Stack Empty: "+ stack.isEmpty());
        System.out.println("Top of the stack is : "+ stack.peek());
        stack.pop();
        System.out.println("Top of the stack is : "+ stack.peek());
        stack.pop();
        System.out.println("Top of the stack is : "+ stack.peek());
        stack.pop();
        System.out.println("Top of the stack is : "+ stack.peek());
        System.out.println("Is Stack Empty: "+ stack.isEmpty());
    }
}
