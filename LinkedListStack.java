import java.util.LinkedList;

public class LinkedListStack{
    private LinkedList<Integer> list;
    

    public LinkedListStack(){
        this.list = new LinkedList<>();
    }

    public void push(int el){
    list.addFirst(el);
    }

    public void pop(){
    if (isEmpty()){
        throw new IndexOutOfBoundsException("cant pop from an empty stack");
    }
    list.removeFirst();
    }

    public int peek(){
        if (isEmpty()){
        throw new IndexOutOfBoundsException("cant peek at an empty stack");
    }
    return list.getFirst();
    }

    public boolean isEmpty(){
    return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public String toString(){
    return list.toString();
    }


}