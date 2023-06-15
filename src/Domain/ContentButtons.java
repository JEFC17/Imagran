/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Logic.CircularDoublyList;
import Logic.Node;

/**
 *
 * @author PC
 */
public class ContentButtons {

    private CircularDoublyList circularDoublyList;

    public ContentButtons() {
        this.circularDoublyList = new CircularDoublyList();
    }

    public void moveRight() {

        CircularDoublyList cdl = new CircularDoublyList();

        Node aux = this.circularDoublyList.getStart();
        while (aux != this.circularDoublyList.getEnd()) {
            cdl.addEnd(aux.next.getElement());
            aux = aux.next;
        }
        cdl.addEnd(this.circularDoublyList.fristInList());
        this.circularDoublyList.cancel();
        for (int i = 0; i < cdl.getSize() - 1; i++) {
            this.circularDoublyList.addEnd(cdl.getByPosition(i));
        }
        this.circularDoublyList.addEnd(cdl.lastInList());
    }

    public void moveLeft() {

        CircularDoublyList cdl = new CircularDoublyList();

        Node aux = this.circularDoublyList.getStart();
        cdl.addEnd(this.circularDoublyList.lastInList());

        while (aux != this.circularDoublyList.getEnd()) {
            cdl.addEnd(aux.getElement());
            aux = aux.next;
        }
        this.circularDoublyList.cancel();
        for (int i = 0; i < cdl.getSize() - 1; i++) {
            this.circularDoublyList.addEnd(cdl.getByPosition(i));
        }
        this.circularDoublyList.addEnd(cdl.lastInList());
    }

    public CircularDoublyList getCircularDoublyList() {
        return circularDoublyList;
    }

    public void setCircularDoublyList(CircularDoublyList circularDoublyList) {
        this.circularDoublyList = circularDoublyList;
    }
}
