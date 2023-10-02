package com.untangle.dsalgoprep.datastructures;

import java.util.Stack;

public class StackDemo {
    

    public static void main(String[] args) {
        
        createStack();
    }

    private static void createStack(){
        Stack<String> stack = new Stack<String>();

        stack.push("Mr.A");
        stack.push("Mrs.B");
        stack.push("Mr.C");
        stack.push("Mr.D");

        System.out.println(stack.empty());
        System.out.println("Stack:: "+stack);
        System.out.println(stack.search("Mr.A"));
        System.out.println(stack.search("Mr.D"));
        stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        System.out.println(stack.search("Mr.D"));
       
        // stack.pop();
        System.out.println(stack.empty());
        
    }

}
