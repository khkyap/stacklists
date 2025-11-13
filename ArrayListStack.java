import java.util.ArrayList;

public class ArrayListStack{
    private ArrayList<Integer> list;

    public ArrayListStack(){
        this.list = new ArrayList<>();
    }

    public void push(int el){
    list.add(el);
    }


    public void pop(){
    if (isEmpty()){
        throw new IndexOutOfBoundsException("cant pop from empty stack");
    }
    list.remove(list.size() - 1);
    }

    public int peek(){
    if (isEmpty()){
        throw new IndexOutOfBoundsException("cant pop from empty stack");
    }
    return list.get(list.size() - 1);
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