/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class CircularDoublyList implements List {

    public Node start;
    public Node end;

    public CircularDoublyList() {
        this.start = null;
        this.end = null;
    }

    public String toString() {
        String toString = "";
        Node aux = this.start;
        boolean end = false;
        while (aux != null && end == false) {
            toString = toString + aux.element + " ";
            aux = aux.next;
            if (aux == this.start) {
                end = true;
            }
        }
        return toString;
    }

    @Override
    public void cancel() {
        this.start = null;
        this.end = null;
    }

    @Override
    public int getSize() {
        if (isEmpty()) {
            return 0;
        } else {
            int counter = 1;
            Node aux = this.start;
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
    public boolean exists(Object element) {
        Node aux = this.start;
        if (!isEmpty()) {
            if (element.equals(this.end.getElement())) {
                return true;
            } else {
                while (aux != this.end) {
                    if (aux.element == element) {
                        return true;
                    }
                    aux = aux.next;
                }
            }
        }

        return false;
    }

    @Override
    public void addHead(Object element) {

        Node newNode = new Node(element);
        if (isEmpty()) {
            this.start = newNode;
            this.end = this.start;
            this.start.next = this.start;
            this.end.back = this.end;
        } else {
            this.start.back = newNode;
            newNode.next = this.start;
            newNode.back = this.end;
            this.start = newNode;
            this.end.next = this.start;
        }
    }

    @Override
    public void addEnd(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.start = newNode;
            this.end = start;
            this.start.next = this.start;
            this.end.back = this.end;
        } else {
            this.end.next = newNode;
            newNode.next = this.start;
            newNode.back = this.end;
            this.end = newNode;
            this.start.back = this.end;
        }
    }

    @Override
    public Object getByPosition(int pos) {
        if (!isEmpty()) {
            int counter = 0;
            Node aux = this.start;
            while (aux != this.end) {
                if (counter == pos) {
                    return aux.getElement();
                }
                aux = aux.next;
                counter++;
            }
            counter++;
            if (pos == counter) {
                return aux.getElement();
            }
        } else {
            throw new ExceptionList("Error 01");
        }
        return null;
    }

    @Override
    public void deleteByElement(Object element) {

        if (!isEmpty()) {
            Node aux = start;
            Node aux2 = new Node("");
            aux2 = null;
            while (aux != this.end) {
                if (aux.element.equals(element)) {
                    if (aux.equals(start)) {
                        start = start.next;
                        start.back = null;
                    } else {
                        aux2.next = aux.next;
                        aux.next.back = aux.back;
                    } // if - else
                } // if
                aux2 = aux;
                aux = aux.next;
            }
        } else {
            throw new ExceptionList("Error 02");
        }
    }

    @Override
    public Object fristInList() {
        if (!isEmpty()) {
            return this.start.getElement();
        } else {
            throw new ExceptionList("Error 01");
        }
    }

    @Override
    public Object lastInList() {
        if (!isEmpty()) {
            return this.end.getElement();
        } else {
            throw new ExceptionList("Error 01");
        }
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

}
