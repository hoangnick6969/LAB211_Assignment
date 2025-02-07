/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author PC
 */
import java.util.Stack;

public class MyStack {
    private Stack<Integer> stackList = new Stack<>();

    public void push(int value) {
        stackList.push(value);
    }

    public void pop() {
        if (!stackList.isEmpty()) {
            System.out.println(stackList.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void get(int position) {
        if (position >= 0 && position < stackList.size()) {
            System.out.println(stackList.get(position));
        } else {
            System.out.println("Invalid position.");
        }
    }
    
    public static void run() {
        MyStack myStack = new MyStack();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int value : list) {
            myStack.push(value);
        }
        myStack.pop();
        myStack.pop();
        for (int i = 0; i < 3; i++) {
            myStack.get(i);
        }
    }
}
