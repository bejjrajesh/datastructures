package datastructures.linear.stack.array;

/*
Stack Implementation using Array.
 */

public class ArrayStack<T> {

    // Index Pointer to keep track of top of the stack.
    int topOfTheStack = -1;

    //Array representing stack.
    int[] stack;

    public ArrayStack(int size){
        stack = new int[size];
    }

    //Push element on the topOfTheStack.
    public void push(int element){

        //Stack is Full when topOfTheStack points to last element in the array.
        if( topOfTheStack == stack.length-1 ) {
            System.out.println("Stack is full");
        } else {
            stack[++topOfTheStack]=element;
        }
    }

    //Returns the pop value from the array.
    public int pop(){

        //If Stack is Empty return -1
        if (topOfTheStack==-1) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            int temp = stack[topOfTheStack];
            topOfTheStack--;
            return temp;
        }
    }

    public boolean isStackFull() {
        return topOfTheStack == stack.length-1;
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
