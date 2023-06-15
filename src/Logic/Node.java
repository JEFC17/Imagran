/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class Node {

    public Object element;
    public Node next;
    public Node back;

    public Node(Object element) {
        this.element = element;
        this.next = null;
        this.back = null;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + ", back=" + back + '}';
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

}
