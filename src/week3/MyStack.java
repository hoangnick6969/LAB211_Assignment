/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Stack;

public class MyStack {

    private Stack<Integer> stackValues = new Stack<>();

    public void push(int value) {
        stackValues.push(value);
        System.out.println("Pushed: " + value);
    }

    public void pop() {
        if (!stackValues.isEmpty()) {
            System.out.println("Popped: " + stackValues.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void get(int position) {
        if (position >= 0 && position < stackValues.size()) {
            System.out.println("Value at position " + position + ": " + stackValues.get(position));
        } else {
            System.out.println("Invalid position.");
        }
    }

    public static void run() {
        MyStack myStack = new MyStack();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Pushing elements:");
        for (int value : list) {
            myStack.push(value);
        }

        System.out.println("\nPopping elements:");
        myStack.pop();
        myStack.pop();

        System.out.println("\nGetting elements:");
        for (int i = 0; i < 3; i++) {
            myStack.get(i);
        }
    }

    
}
