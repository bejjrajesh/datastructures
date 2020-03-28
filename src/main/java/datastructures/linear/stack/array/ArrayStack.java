package datastructures.linear.stack.array;

public class ArrayStack<T> {

    int topOfTheStack=-1;
    int[] stack;

    public ArrayStack(int size){
        stack = new int[size];
    }

    public void push(int element){
        if(topOfTheStack == stack.length-1){
            System.out.println("Stack is full");
        }else{
            stack[++topOfTheStack]=element;
        }
    }

    public int pop(){
        if(topOfTheStack==-1){
            System.out.println("Stack is Empty!");
            return 0;
        }else {
            int temp = stack[topOfTheStack];
            topOfTheStack--;
            return temp;
        }
    }

    public boolean isStackFull() {
        return topOfTheStack == stack.length;
    }

    public boolean isStackEmpty(){
        return topOfTheStack==-1;
    }

    public int peek(){
        if(topOfTheStack==-1){
            return -1;
        }else {
            return stack[topOfTheStack];
        }
    }
}
