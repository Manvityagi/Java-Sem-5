/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Stack {
    int[] arr;
    int top;
    
    Stack(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
    }

    public void push(int item) throws Exception {
        if (isfull()) {
            throw new Exception("Stack is full");
        }

        this.top++;
        arr[top] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        int val = this.arr[this.top];
        this.arr[this.top] = 0;
        this.top--;
        return val;
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        // return this.size() == 0;
        return this.top == -1;
    }

    public boolean isfull() {
        return this.size() == this.arr.length;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return this.arr[this.top];
    }

    public void display(){
        for(int i = this.top; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }
}
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);

        stack.display();

        stack.pop();

        stack.push(3);

        stack.display();
	}
}
