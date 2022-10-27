package Stack;

public class stack_class <T> {
    int size; // size of stack
    int top;
    Object[] ArrayStack; // object of stack
    // constractor
    public  stack_class(int size){
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1;
    }
    public void push(Object newItem){ //add
        if (top==size-1){ //stack if full
            System.out.print("Stack over flow\n");
        }else {
            top = top + 1;
            ArrayStack[top] = newItem;
        }
    }
    public T pop() { //delete
        if (top == 0) {//STACK is empty
            System.out.println("stack is under flow");
            return null;
        } else {
            T item = (T) ArrayStack[top];
            top = top - 1;
            return item;

        }
    }
}
