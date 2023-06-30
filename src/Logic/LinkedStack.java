/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class LinkedStack implements Stack {

    public NodeStack top;
    public int count;

    public LinkedStack() {
        this.top = null;
        this.count = 0;
    }

    public String toString() {
        String toString = "";
        NodeStack aux = this.top;
        while (aux != null) {
            toString = toString + aux.getElement() + " ";
            aux = aux.next;
        }
        return toString;
    }

    public int getSizeByList() {
        if (isEmpty()) {
            return 0;
        } else {
            int counter = 0;
            NodeStack aux = this.top;
            while (aux != null) {
                aux = aux.next;
                counter++;
            }
            return counter;
        }
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void cancel() {
        this.top = null;
        this.count = 0;
    }

    @Override
    public Object top() {
        if (!isEmpty()) {

            return this.top.getElement();
        }
        return null;
    }

    @Override
    public void push(Object element) {
        NodeStack newNode = new NodeStack(element);
        NodeStack auxNode = this.top;
        if (isEmpty()) {
            this.top = newNode;
            this.count++;
        } else {
            newNode.next = auxNode;
            this.top = newNode;
            this.count++;
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            if (this.top == null) {
                cancel();
                return null;
            } else {
                NodeStack aux = this.top.next;
                this.top = aux;
                this.count--;
            }
            return top();
        }
        return null;
    }
}
