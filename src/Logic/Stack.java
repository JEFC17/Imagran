/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public interface Stack {

    //Cantidad de nodos de la lista.
    public int getSize();

    //True si la lista esta vacia.
    public boolean isEmpty();

    //Elimina toda la lista.
    public void cancel();

    public Object top();

    public void push(Object element);

    public Object pop();

}
