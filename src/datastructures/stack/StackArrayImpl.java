package datastructures.stack;

import java.util.ArrayList;

public class StackArrayImpl implements Stack {

    private ArrayList<Object> stack = new ArrayList<Object>();

    public StackArrayImpl(){
        stack = new ArrayList<>();
    }

    @Override
    public void push(Object item) {
        stack.add(0,item);

    }

    @Override
    public Object pop() {
        return stack.remove(0);
    }

    @Override
    public boolean empty() {
        return stack.size() == 0;
    }
}