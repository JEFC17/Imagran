/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class NodeQueue {
    
    public Object element;
    public NodeQueue next;

    public NodeQueue(Object element) {
        this.element = element;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + '}';
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    
}
