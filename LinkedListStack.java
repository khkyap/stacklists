import java.util.LinkedList;

public class LinkedListStack{
    private Node <Integer> head;
    private int size;

    public LinkedListStack(){
        this.head = null;
        this.size = 0;
    }

    public void push(int el){
    Node<Integer> n = new Node(el);
        n.setNext(this.head);
        this.head = n;
        this.size++;
    }

    public void pop(){
        if (this.head != null){
    this.head = this.head.getNext();
    this.size--;
    }
    }

    public int peek(){
        if (isEmpty()){
            return null;
        }
    return head.getData();
    }

    public boolean isEmpty(){
    if (head == null){
        return true;
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