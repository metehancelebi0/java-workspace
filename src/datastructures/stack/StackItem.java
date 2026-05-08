package datastructures.stack;

public class StackItem {
    private Object item;

    StackItem next;

    public StackItem(Object item) {
        this.item = item;
    }

    public Object getItem(){
        return item;
    }

    public void setItem(Object item){
        this.item = item;
    }

    public StackItem getNext(){
        return next;
    }

    public void setNext(StackItem next){
        this.next = next;
    }
}
