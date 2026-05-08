package datastructures.demo;

import datastructures.stack.Stack;
import datastructures.stack.StackArrayImpl;
import datastructures.stack.StackImpl;

public class StackDemo {

    public static void main(String[] args){

        Stack stack = new StackArrayImpl();
        stack.push("A");
        stack.push(5);
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("Stack");

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}