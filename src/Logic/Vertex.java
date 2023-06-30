/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Jelki
 */
public class Vertex {
    
    public Object element;
    public CircularDoublyList listEdge;
    public CircularDoublyList listWeight;
    public boolean visited;

    public Vertex(Object element) {
        this.element = element;
        this.listEdge = new CircularDoublyList();
        this.listWeight = new CircularDoublyList();
        this.visited = false;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public CircularDoublyList getListEdge() {
        return listEdge;
    }

    public void setListEdge(CircularDoublyList listEdge) {
        this.listEdge = listEdge;
    }

    public CircularDoublyList getListweight() {
        return listWeight;
    }

    public void setListweight(CircularDoublyList listweight) {
        this.listWeight = listweight;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return element.toString();
    }
    
}
