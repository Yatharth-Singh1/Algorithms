package stack;

import java.util.Stack;

public class stackusingklinskedlist {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class stack{
    public static Node head; 

    public static boolean isEmpty(){
        return head==null;
    }

    public static void push(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            head.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    public static int pop(){
        if (head == null){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public static int peek(){
        if (head == null){
            return -1;
        }
        int top = head.data;
        return top;
    }
    public static void main(String args[]){
        Stack ll = new Stack();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        for (int i = 0;i<=2;i++){
            System.out.println(ll.peek());
            ll.pop();
        }

    }
}
}
