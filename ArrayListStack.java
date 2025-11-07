import java.util.ArrayList;

public class ArrayListStack{
    private Integer[] elements;
    private int top;

    public ArrayListStack{
        elements = new Integer[10];
        top = 0;
    }

    public void push(int el){
    top++;
    elements[top] = el;
    }

    public void pop(){
    elements[top] = 0;
    top--;
    }

    public int peek(){
    return top;
    }

    public boolean isEmpty(){
    if (top == 0){
        if (elements[top] == null){
            return true;
        }
    }
    return false;
    }

    public int size(){
        return size;
    }

    public String toString(){
    elements.toString();
    }

}