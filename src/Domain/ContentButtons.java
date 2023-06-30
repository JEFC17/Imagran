/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Logic.CircularDoublyList;
import Logic.LinkedQueue;
import Logic.LinkedStack;
import Logic.Node;

/**
 *
 * @author PC
 */
public class ContentButtons {

    public void moveRightRequests(LinkedQueue lq) {
        LinkedQueue queue = new LinkedQueue();

        Object fristInList = lq.fristElement();
        lq.delete();

        while (!lq.isEmpty()) {
            queue.insert(lq.fristElement());
            lq.delete();
            System.out.println(lq.getSize());
        }
        lq.cancel();
        while (!queue.isEmpty()) {
            lq.insert(queue.fristElement());
            queue.delete();
        }
        queue.cancel();
        lq.insert(fristInList);
    }

    public void moveLeftRequests(LinkedQueue lq) {

        LinkedQueue queue = new LinkedQueue();

        Object fristInList = new Object();

        while (!lq.isEmpty()) {
            if (lq.getSize() == 1) {
                fristInList = lq.fristElement();
                lq.delete();

            } else {
                queue.insert(lq.fristElement());
                lq.delete();
            }
        }
        lq.cancel();
        lq.insert(fristInList);

        while (!queue.isEmpty()) {
            lq.insert(queue.fristElement());
            queue.delete();
        }
        queue.cancel();
    }

    public void moveRight(LinkedStack linkedStack) {
        LinkedStack ls = new LinkedStack();
        Object fristInList = new Object();

        Object object = linkedStack.top;

        while (!linkedStack.isEmpty()) {
            ls.push(linkedStack.top());
            linkedStack.pop();
        }
        fristInList = ls.top();
        ls.pop();

        linkedStack.cancel();
        while (!ls.isEmpty()) {
            linkedStack.push(ls.top());
            ls.pop();
        }
        linkedStack.push(fristInList);

    }

    public void moveLeft(LinkedStack linkedStack) {
        LinkedStack ls = new LinkedStack();
        Object fristInList = new Object();

        Object object = linkedStack.top;

        fristInList = linkedStack.top();
        linkedStack.pop();

        while (!linkedStack.isEmpty()) {
            ls.push(linkedStack.top());
            linkedStack.pop();
        }
        ls.push(fristInList);
        linkedStack.cancel();
        while (!ls.isEmpty()) {
            linkedStack.push(ls.top());
            ls.pop();
        }
    }

    public void moveUp(CircularDoublyList circularDoublyList) {
        CircularDoublyList cdl = new CircularDoublyList();

        Node aux = circularDoublyList.getStart();
        cdl.addEnd(circularDoublyList.lastInList());

        while (aux != circularDoublyList.getEnd()) {
            cdl.addEnd(aux.getElement());
            aux = aux.next;
        }
        circularDoublyList.cancel();
        for (int i = 0; i < cdl.getSize() - 1; i++) {
            circularDoublyList.addEnd(cdl.getByPosition(i));
        }
        circularDoublyList.addEnd(cdl.lastInList());
    }

    public void moveDown(CircularDoublyList circularDoublyList) {
        CircularDoublyList cdl = new CircularDoublyList();

        Node aux = circularDoublyList.getStart();
        while (aux != circularDoublyList.getEnd()) {
            cdl.addEnd(aux.next.getElement());
            aux = aux.next;
        }
        cdl.addEnd(circularDoublyList.fristInList());
        circularDoublyList.cancel();
        for (int i = 0; i < cdl.getSize() - 1; i++) {
            circularDoublyList.addEnd(cdl.getByPosition(i));
        }
        circularDoublyList.addEnd(cdl.lastInList());
    }
}
