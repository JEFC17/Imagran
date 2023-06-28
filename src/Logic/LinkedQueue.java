/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class LinkedQueue implements Queue {

    private NodeQueue start;
    private NodeQueue end;

    public LinkedQueue() {

        this.end = this.start = null;
    }

    public String toString() {
        String toString = "";
        NodeQueue aux = this.start;
        while (aux != null) {
            toString =   aux.getElement() + " "+toString;
            aux = aux.next;
        }
        return toString;
    }

    @Override
    public int getSize() {
        if (isEmpty()) {
            return 0;
        } else {
            int counter = 1;
            NodeQueue aux = this.start;
            while (aux != this.end) {
                aux = aux.next;
                counter++;
            }
            return counter;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.start == null;
    }

    @Override
    public void cancel() {
        this.end = this.start = null;
    }

    @Override
    public void insert(Object element) {

        NodeQueue newNode = new NodeQueue(element);
        NodeQueue auxNode = this.start;
        if (isEmpty()) {
            this.start=this.end = newNode;
        } else {
            newNode.next = auxNode;
            this.start = newNode;
        }
    }

    @Override
    public Object delete() {
        NodeQueue aux = start;
        if (!isEmpty()) {
            if (start.next==null) {
                cancel();
            }
            while (aux.next != this.end) {
                aux = aux.next;
            }
            aux.next = null;
            this.end = aux;
        }
        return aux;
    }

    @Override
    public Object fristElement() {
        return this.end.getElement();
    }
}
